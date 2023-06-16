package com.guru.ebrain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.guru.ebrain.dto.SchoolDto;
import com.guru.ebrain.service.SchoolService;

@RestController
public class SchoolController {
@Autowired
SchoolService schoolservice;
@PostMapping("/enter")
public String create(@RequestBody SchoolDto dto) {
	schoolservice.save(dto);
	return "SUCCESS";
}
}
