package com.doctor.patients.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctor.patients.entity.Doctor;
import com.doctor.patients.repository.DoctorRepository;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;

	public String save(Doctor doctor) {
		doctorRepository.save(doctor);
		return "ok";
	}

}
