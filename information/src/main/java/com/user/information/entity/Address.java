package com.user.information.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="address")
@Data


public class Address {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="id")
		private int id;
		
		
		@Column(name="name")
		private String name;
		
		
		@Column(name="address")
		private String address;
		
		
		@Column(name="father_name")
		private String fatherName;
		
		@JsonIgnore
		@OneToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "address_id")
		private User user;
		
		
		

}
