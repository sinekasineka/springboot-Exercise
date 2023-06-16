package com.school.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.school.entity.Address;
import com.school.school.entity.School;
import com.school.school.repository.AddressRepository;
import com.school.school.repository.SchoolRepository;

@Service

public class SchoolService {
	@Autowired
	private SchoolRepository schoolRepository;

	@Autowired
	private AddressRepository addressRepository;

	public String save(School school) {
	schoolRepository.save(school);
	   
		for (Address obj : school.getAddress()) {
			obj.setSchool(school);
			addressRepository.save(obj);
		}
		return "success";
	}

}
