package com.one.to.one.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.one.to.one.project.entity.Laptop;
import com.one.to.one.project.repository.LaptopRepository;

@Service

public class LaptopService {
	@Autowired 
	private LaptopRepository laptopRepository;
	
	public String save(Laptop laptop) {
		laptopRepository.saveAndFlush(laptop);
		return "ok";
	}
	

}
