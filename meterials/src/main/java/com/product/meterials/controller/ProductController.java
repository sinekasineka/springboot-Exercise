package com.product.meterials.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.meterials.entity.Product;
import com.product.meterials.service.ProductService;

@RestController

public class ProductController {
	@Autowired
	 private ProductService productservice;
	@PostMapping("/save")
	private String save(@RequestBody Product product) {
		productservice.save(product);
		return "ok";
	}
	

}
