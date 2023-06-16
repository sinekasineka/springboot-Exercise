package com.Info.Tech.controller;

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

import com.Info.Tech.entity.Employees;
import com.Info.Tech.serivce.EmployeesService;

@RestController

public class EmployeesController {

	@Autowired
	private EmployeesService employeesSerive;

	@PostMapping("/save")

	private String save(@RequestBody Employees employees) {
		employeesSerive.save(employees);
		return "ok";
	}
	@GetMapping("/getAll")
	private List<Employees> getAll(){
		 return employeesSerive.getAll();
		
	}
	@GetMapping("/get/{id}")
	private Optional<Employees> getById(@PathVariable("id")Integer id){
		 return employeesSerive.getById(id);
	}
	@DeleteMapping("delete/{id}")
	private String deleteById(@PathVariable("id")Integer id){
		 employeesSerive.deleteById(id);
		 return "ok";
	}
	@PutMapping("/update/{id}")
	private void update(@RequestBody Employees employees) {
	employeesSerive.update(employees);
	
	
	}
}
