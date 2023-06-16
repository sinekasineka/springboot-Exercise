package com.SuperMarket.simpleProject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.SuperMarket.simpleProject.entity.CustomerDetails;
import com.SuperMarket.simpleProject.service.CustomerDetailsService;





@RestController
public class CustomerDetailsController {

	@Autowired
	private CustomerDetailsService customerDetailsService;

	@PostMapping("/save")
	private String save(@RequestBody CustomerDetails customerDetails) {
		customerDetailsService.save(customerDetails);

		return "ok";
	}
//	@GetMapping("/get")
//	private List<CustomerDetails> getAll() {
//		return customerDetailsService.getAll();
//		 
//	}
//	@GetMapping("/get/{id}")
//	private Optional<CustomerDetails>getById(@PathVariable("id")Integer id){
//		 return customerDetailsService.getById(id);
//	}
//	@PutMapping("/update/{id}")
//	private void update(@RequestBody  CustomerDetails customerDetails) {
//		customerDetailsService.update(customerDetails);
//	}
//	@DeleteMapping("/delete/{id}")
//	private void delete(@PathVariable ("id")Integer id) {
//	customerDetailsService.delete(id);
//
//}
}