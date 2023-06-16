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

//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Entity
//@Table(name = "product")
//
//	
//
//public class Product {
//
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "id")
//	private int id;
//	
//	
//	
//	@Column(name="name")
//	private String name;
//	
//	
//	@Column(name="quality")
//	private int quality;
//	
//	
//	@Column(name="quantity")
//	private String quantity;
//	
//	
//	@Column(name="price")
//	private int price;
//	
//	
//	@JsonIgnore
//	@ManyToOne(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
//	@JoinColumn(name="shopping_id",referencedColumnName = "id")
//	private OnlineShopping onlineShoping;
//	
//	



