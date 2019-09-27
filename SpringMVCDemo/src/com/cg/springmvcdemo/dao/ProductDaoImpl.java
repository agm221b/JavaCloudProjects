package com.cg.springmvcdemo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.springmvcdemo.dto.Product;

@Repository("productrepo")
public class ProductDaoImpl implements ProductDao {
	@PersistenceContext
	EntityManager entityManager;
	
	

	
	@Override
	public Product saveProduct(Product pro) {
		// TODO Auto-generated method stub
		entityManager.persist(pro);
		return pro;
	}

	@Override
	public List<Product> findAllProduct() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("FROM Product");
		List<Product> prodList =query.getResultList();
		
		return prodList;
	}

	@Override
	public Product findByProductId(int productId) {
		// TODO Aut-generated method stub
		/*
		 * for (Product product : prodList) { if (product.getProdId() == productId)
		 * return product; } return null;
		 */
		
		return entityManager.find(Product.class, productId);
	}

	@Override
	public int removeProduct(int productId) {
		// TODO Auto-generated method stub
		/*
		 * for (Product product : prodList) { if (product.getProdId() == productId) {
		 * prodList.remove(product); return 1; } } return 1;
		 */
		Product pro =entityManager.find(Product.class, productId);
		entityManager.remove(pro);
		return 1;
	}

}
