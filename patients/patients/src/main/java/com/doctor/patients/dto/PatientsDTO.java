package com.doctor.patients.dto;

import java.util.UUID;

import lombok.Data;

@Data
public class PatientsDTO {
	
	private UUID id;

	private String patientsName;

	private String address;

	private long phoneNumber;

}
