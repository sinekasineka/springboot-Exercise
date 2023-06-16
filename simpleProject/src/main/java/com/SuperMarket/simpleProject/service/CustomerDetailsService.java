package com.SuperMarket.simpleProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SuperMarket.simpleProject.entity.CustomerDetails;
import com.SuperMarket.simpleProject.repository.CustomerDetailsRepository;

@Service

public class CustomerDetailsService {
	@Autowired
	private CustomerDetailsRepository customerDetailsRepository;

	public String save(CustomerDetails customerDetails) {
		customerDetailsRepository.save(customerDetails);

		return "ok";
	}}
//
//	public List<CustomerDetails> getAll() {
//		return customerDetailsRepository.findAll();
//	}
//
//	public Optional<CustomerDetails> getById(Integer id) {
//		return customerDetailsRepository.findById(id);
//	}
//
//	public String update(CustomerDetails customerDetails) {
//		customerDetailsRepository.saveAndFlush(customerDetails);
//		return "ok";
//	}
//	public String delete(Integer id) {
//		customerDetailsRepository.deleteById(id);
//	}
//
//}
