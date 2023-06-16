package com.online.shoping.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "customer")

public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	
	@Column(name="name")
	private String name;
	
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	
	@Column(name="age")
	private int age;
	
	
	@Column(name="address")
	private String address;
	
	
	
	@Column(name="product_amount")
	private Double productAmount;
	
	

	@ManyToOne(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="shopping_id")
	private OnlineShopping onlineShopping;
	
	
	
	
	
	

}
