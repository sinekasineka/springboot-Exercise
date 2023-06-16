package com.example.EbrainTechnologies.sampleProject.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EbrainTechnologies.sampleProject.entity.EmployeeDetails;
import com.example.EbrainTechnologies.sampleProject.repository.EmployeeDetailsRepository;


@Service

public class EmployeeDetailsService {
	@Autowired
	private EmployeeDetailsRepository employeeDetailsRepository;

	public String save(EmployeeDetails employeeDetails) {

		employeeDetailsRepository.saveAndFlush(employeeDetails);
		return "ok";

	}

	public List<EmployeeDetails> getAll() {
		return employeeDetailsRepository.findAll();

	}

	public String update(EmployeeDetails employeeDetails) {
		employeeDetailsRepository.saveAndFlush(employeeDetails);
		return "ok";
	}

	public String delete(Integer id) {
		if(id !=null) {
			Optional<EmployeeDetails>obj1=employeeDetailsRepository.findById(id);
		EmployeeDetails oDetails=obj1.get();
		oDetails.setDeletedBy("sneka");
		oDetails.setDeletedOn(new Date());
		oDetails.setStatus("InActive");
		employeeDetailsRepository.saveAndFlush(oDetails);
	}
	return "deleted";
}
}