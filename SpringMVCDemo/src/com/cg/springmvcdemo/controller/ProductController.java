package com.cg.springmvcdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springmvcdemo.dto.Product;
import com.cg.springmvcdemo.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productservice;
	@RequestMapping(value = "/myfirst", method = RequestMethod.GET)
	public String homePage() {
		return "home";
	}
	
	@RequestMapping(value = "/addpage" ,method=RequestMethod.GET)
	public String addProduct(@ModelAttribute("model") Product pro) {
		return "AddProduct";
	}
	@RequestMapping(value = "/pagesubmit", method = RequestMethod.POST)
	public String addData(@ModelAttribute("model") Product pro) {
		System.out.println(pro);
		productservice.addProduct(pro);
		return "home";
	}
	@RequestMapping(value = "/showall", method = RequestMethod.GET)
	public ModelAndView getAllData() {
		List<Product> myList = productservice.showProduct();
		return new ModelAndView("ShowProduct", "prodList", myList);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deletePage() {
		return "DeleteProduct";
	}
	@RequestMapping(value = "/deleteproduct", method = RequestMethod.POST)
	public String deleteData(@RequestParam("pid")int prodId) {
		//System.out.println(pro);
//		productservice.`(pro);
		System.out.println(prodId);
		productservice.removeProduct(prodId);
		return "redirect:/showall";
	}
	
	
}
