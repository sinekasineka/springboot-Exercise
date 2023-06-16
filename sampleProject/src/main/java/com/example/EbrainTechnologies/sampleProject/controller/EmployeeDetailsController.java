package com.example.EbrainTechnologies.sampleProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EbrainTechnologies.sampleProject.entity.EmployeeDetails;
import com.example.EbrainTechnologies.sampleProject.service.EmployeeDetailsService;

@RestController

public class EmployeeDetailsController {
	@Autowired
	private EmployeeDetailsService employeeDetailsService;

	@PostMapping("/save")
	private String save(@RequestBody EmployeeDetails employeeDetails) {
		employeeDetailsService.save(employeeDetails);
		return "ok";

	}

	@GetMapping("/get")
	private List<EmployeeDetails> getAll() {
		return employeeDetailsService.getAll();
	}

	@PutMapping("/update/{id}")
	private String update(@RequestBody EmployeeDetails employeeDetails) {
		return employeeDetailsService.update(employeeDetails);

	}

	@DeleteMapping("/delete/{id}")
	private String delete(@PathVariable("id") Integer id) {
		return employeeDetailsService.delete(id);
	}
}