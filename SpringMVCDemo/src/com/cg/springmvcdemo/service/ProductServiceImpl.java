package com.cg.springmvcdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springmvcdemo.dao.ProductDao;
import com.cg.springmvcdemo.dto.Product;

@Service("productservice")
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDao productrepo;

	@Override
	public Product addProduct(Product pro) {
		// TODO Auto-generated method stub
		return productrepo.saveProduct(pro);
	}

	@Override
	public List<Product> showProduct() {
		// TODO Auto-generated method stub
		return productrepo.findAllProduct();
	}

	@Override
	public Product searchProduct(int productId) {
		// TODO Auto-generated method stub
		return productrepo.findByProductId(productId);
	}


	@Override
	public int removeProduct(int productId) {
		// TODO Auto-generated method stub
		return productrepo.removeProduct(productId);
	}
}
