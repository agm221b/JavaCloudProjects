package com.cg.SpringBootDemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.SpringBootDemo.dto.Product;
@Repository("proddao")
public class ProductDaoImpl implements ProductDao {
List<Product> myList = new ArrayList<Product>();
	@Override
	public Product addProduct(Product pro) {
		// TODO Auto-generated method stub
		myList.add(pro);
		return pro;
	}

	@Override
	public List<Product> showAllProduct() {
		// TODO Auto-generated method stub
		return myList;
	}

}