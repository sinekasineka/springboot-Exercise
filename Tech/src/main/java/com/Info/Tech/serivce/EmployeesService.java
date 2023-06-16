package com.Info.Tech.serivce;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Info.Tech.entity.Employees;
import com.Info.Tech.repository.EmployeesRepository;

@Service


public class EmployeesService {
	@Autowired
	private EmployeesRepository employeesRepository;
	
	public String save(Employees employees) {
		employeesRepository.saveAndFlush(employees);
		return "ok";
	}
	public List<Employees> getAll(){
		 return employeesRepository.findAll();
	} 
	public Optional<Employees> getById(Integer id){
	return	employeesRepository.findById(id);
	}
	public void deleteById(Integer id){
		 employeesRepository.deleteById(id);
	}
	public String update(Employees employees) {
		employeesRepository.saveAndFlush(employees);
		return "ok";
	}

}
