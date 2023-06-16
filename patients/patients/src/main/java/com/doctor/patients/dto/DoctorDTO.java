package com.doctor.patients.dto;

import java.util.UUID;

import lombok.Data;
@Data
public class DoctorDTO {
	
	
	private UUID id;

	
	private String doctorName;


	private String hospitalName;

	
	private long phoneNumber;

	
	private String address;
}
