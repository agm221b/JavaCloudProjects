package com.cg.springmvcdemo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
		return "jsp/home";
	}

	@RequestMapping(value = "/addpage", method = RequestMethod.GET)
	public String addProduct(@ModelAttribute("model") Product pro, Map<String, Object> modelmap) {
		List<String> types = new ArrayList<String>();
		types.add("SELECT");
		types.add("Electronics");
		types.add("Fashion");
		types.add("Daily Needs");
		modelmap.put("dataitem", types);

		List<String> features = new ArrayList<String>();
		features.add("Same Day Delivery");
		features.add("30 day returns");
		features.add("Free Shipping");
		modelmap.put("datafeatures", features);
		return "jsp/AddProduct";
	}

	@RequestMapping(value = "/pagesubmit", method = RequestMethod.POST)
	public String addData(@Valid @ModelAttribute("model") Product pro, BindingResult result, Map<String, Object> modelmap) {
		System.out.println(pro);
		List<String> types = new ArrayList<String>();
		types.add("SELECT");
		types.add("Electronics");
		types.add("Fashion");
		types.add("Daily Needs");
		modelmap.put("dataitem", types);

		List<String> features = new ArrayList<String>();
		features.add("Same Day Delivery");
		features.add("30 day returns");
		features.add("Free Shipping");
		modelmap.put("datafeatures", features);
		if (result.hasErrors())
			return "jsp/AddProduct";
		else {
			productservice.addProduct(pro);
			return "home";
		}
	}

	@RequestMapping(value = "/showall", method = RequestMethod.GET)
	public ModelAndView getAllData() {
		List<Product> myList = productservice.showProduct();
		return new ModelAndView("jsp/ShowProduct", "prodList", myList);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteProduct() {
		return "jsp/DeleteProduct";
	}

	@RequestMapping(value = "/deleteproduct", method = RequestMethod.POST)
	public String deleteData(@RequestParam("pid") int prodId) {

		System.out.println(prodId);
		productservice.removeProduct(prodId);
		return "redirect:/showall";
	}

	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public String findProduct() {
		return "jsp/FindProduct";
	}

	@RequestMapping(value = "/findprod", method = RequestMethod.POST)
	public ModelAndView findData(@RequestParam("pid") int prodId) {

		System.out.println(prodId);
		List<Product> productList = new ArrayList<Product>();
		productList.add(productservice.searchProduct(prodId));
		return new ModelAndView("jsp/FindProduct", "prodList", productList);
	}

}
