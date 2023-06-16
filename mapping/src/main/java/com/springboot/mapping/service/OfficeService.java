package com.springboot.mapping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mapping.entity.Employees;
import com.springboot.mapping.entity.Office;
import com.springboot.mapping.repository.EmployeesRepository;
import com.springboot.mapping.repository.OfficeRepository;

@Service

public class OfficeService {
	@Autowired
	private OfficeRepository officeRepository;
	@Autowired
	private EmployeesRepository employeesRepository;
	
	public String save(Office office) {
		officeRepository.save(office);
		
		for(Employees obj:office.getEmployees()) {
			obj.setOffice(office);
		employeesRepository.save(obj);
	}
	return "success";

}
}