package com.guru.ebrain.dto;

import java.util.List;

import lombok.Data;

@Data
public class SchoolDto {
	private int id;
	private String name;
	private String address;

	List<StudentDto> studentlist;
}
