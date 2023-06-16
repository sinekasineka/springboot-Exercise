package com.online.shoping.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "shopping")

public class OnlineShopping {



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	
	@Column(name="name")
	private String name;
	
	
	@Column(name="address")
	private String address;
	
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	
	@OneToMany(mappedBy = "onlineShopping",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Customer> customer;
//	
//	@OneToMany(mappedBy="onlineShoping",cascade=CascadeType.ALL,fetch = FetchType.EAGER)
//	private List<Product> product;
//	



}
