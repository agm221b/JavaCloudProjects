package com.cg.springmvcdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.springmvcdemo.dto.Product;

@Repository("productrepo")
public class ProductDaoImpl implements ProductDao {
	List<Product> prodList = new ArrayList<Product>();

	@Override
	public Product saveProduct(Product pro) {
		// TODO Auto-generated method stub
		prodList.add(pro);
		return pro;
	}

	@Override
	public List<Product> findAllProduct() {
		// TODO Auto-generated method stub
		return prodList;
	}

	@Override
	public Product findByProductId(int productId) {
		// TODO Aut-generated method stub
		for (Product product : prodList) {
			if (product.getProdId() == productId)
				return product;
		}
		return null;
	}

	@Override
	public int removeProduct(int productId) {
		// TODO Auto-generated method stub
		for (Product product : prodList) {
			if (product.getProdId() == productId) {
				prodList.remove(product);
				return 1;
			}
		}
		return 1;
	}

}
