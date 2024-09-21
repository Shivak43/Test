package com.shiva.springcloud.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shiva.springcloud.model.Product;
import com.shiva.springcloud.model.repo.ProductRepo;

@RestController("productapi")
public class ProductController {
	
	@Autowired
	ProductRepo productRepo;
	
	@RequestMapping(value="/products", method=RequestMethod.POST)
	public Product create (@RequestBody Product product) {
		String s="shiva";
		return productRepo.save(product);
	}
	
//	@RequestMapping(value="getProduct", method =Requestmethod.GET)
//	public Product getProduct(@PathVariable(""))

}
