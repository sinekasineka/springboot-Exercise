package com.example.EbrainTechnologies.sampleProject.entity;

import java.util.Date;

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
@Table(name = "employee_details")

public class EmployeeDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "emp_name")
	private String empName;

	@Column(name = "emp_role")
	private String empRole;

	@Column(name = "age")
	private int age;

	@Column(name = "dob")
	private String dob;

	@Column(name = "address")
	private String address;

	@Column(name = "emp_code")
	private int empCode;

	@Column(name = "dob_joining")
	private String dobJoining;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "e_mail")
	private String email;
	
	@Column(name="modified_by")
	private String  modifiedBy;
	
	
	@Column(name="modified_on")
	private Date modifiedOn;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="created_on")
	private Date createdOn;
	
	
	@Column(name="deleted_by")
	private String deletedBy;
	
	
	@Column(name = "deleted_on")
	private  Date deletedOn;
	
	@Column(name="status")
	private String status;
	
	
	
	

}
