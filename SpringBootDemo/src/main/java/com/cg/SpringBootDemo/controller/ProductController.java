package com.cg.SpringBootDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.SpringBootDemo.dto.Product;
import com.cg.SpringBootDemo.service.ProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
	@Autowired
	ProductService prodservice;

	@GetMapping(value = "/getall")
	public List<Product> getAllProduct() {
		
		return prodservice.showAllProduct();
	}
	
	@PostMapping(value = "/add")
	public Product addProduct(@ModelAttribute Product prod) {
		System.out.println(prod);
		return prodservice.addProduct(prod);
	}
	
	@PostMapping(value = "/addreq")
	public Product addProductViaReqBody(@RequestBody Product prod) {
		System.out.println(prod);
		return prodservice.addProduct(prod);
	}
	
	@DeleteMapping(value = "/delete")
	public String deleteProduct() {
		return "Delete Product";
	}
}
