package com.school.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.school.school.entity.School;
import com.school.school.service.SchoolService;

@RestController

public class SchoolController {
	@Autowired
	 private SchoolService schoolService;
	
	@PostMapping("/save")
	private String save(@RequestBody School school) {
		schoolService.save(school);
		return  "ok";
	}

}
