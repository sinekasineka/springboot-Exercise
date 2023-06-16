package com.springboot.mapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mapping.entity.Office;
import com.springboot.mapping.service.OfficeService;

@RestController

public class OfficeController {
	@Autowired
	private OfficeService officeService;

	@PostMapping("/save")
	private String save(@RequestBody Office office) {
		officeService.save(office);
		return "ok";
	}

}
