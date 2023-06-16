package com.product.meterials.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.meterials.entity.Product;
import com.product.meterials.repository.productRepository;

@Service

public class ProductService {
	@Autowired  
	 private productRepository productrepository;
	 
	 
	 public String save(Product product) {
		 productrepository.saveAndFlush( product);
		 return "ok";

	 }

}
