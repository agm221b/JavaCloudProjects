package com.cg.springmvcdemo.dao;

import java.util.List;

import com.cg.springmvcdemo.dto.Product;

public interface ProductDao {

	public Product saveProduct(Product pro);
	public List<Product> findAllProduct();
	public Product findByProductId(int productId);
	public int removeProduct(int productId);
}
