package com.doctor.patients.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doctor.patients.entity.Doctor;
import com.doctor.patients.service.DoctorService;

@RestController
public class DoctorController {

	@Autowired
	private DoctorService doctorService;

	@PostMapping("/save")
	private String save(@RequestBody Doctor doctor) {
		doctorService.save(doctor);
		return "ok";
	}

}
