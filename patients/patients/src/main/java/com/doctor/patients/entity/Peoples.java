//package com.doctor.patients.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Data
//@Table(name="peoples")
//
//
//public class Peoples {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name="id")
//	private int id;
//	
//	@Column(name="name")
//	private String name;
//	
//	@Column(name="phone_number")
//	private long phoneNumber;
//	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "doctor_id")
//	private Doctor doctor;
//
//}
