package com.one.to.one.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.one.to.one.project.entity.Laptop;
import com.one.to.one.project.service.LaptopService;

@RestController

public class LaptopController {
	@Autowired
	private LaptopService laptopService;
	
	@PostMapping("/save")
	private String save(@RequestBody Laptop laptop) {
		laptopService.save(laptop);
		return "ok";
	}

}
