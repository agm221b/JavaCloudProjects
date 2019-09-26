package com.cg.springmvcdemo.service;

import java.util.List;

import com.cg.springmvcdemo.dto.Product;

public interface ProductService {

	
	public Product addProduct(Product pro);
	public List<Product> showProduct();
	public Product searchProduct(int productId);
	public int removeProduct(int productId);
}
