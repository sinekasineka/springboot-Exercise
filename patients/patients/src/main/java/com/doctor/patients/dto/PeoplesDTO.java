package com.doctor.patients.dto;

import javax.persistence.Column;

import lombok.Data;

@Data

public class PeoplesDTO {
	private int id;
	private String name;
	private long phoneNumber;

}
