package com.Info.Tech.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name="employees")


public class Employees {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	
	@Column(name="emp_name")
	private String empName;
	
	@Column(name="address")
	private String address;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="salary")
	private double salary ;
	
	@Column(name="experiance")
	private String experiance;
	
	
	@Column(name="father_name")
	private String fatherName;
	
	
	@Column(name="dob")
	private String dob;
	
	
	

	
	

	
	

}
