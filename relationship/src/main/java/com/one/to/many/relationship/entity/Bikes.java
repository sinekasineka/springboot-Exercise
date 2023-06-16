package com.one.to.many.relationship.entity;



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
@Table(name="bikes")

public class Bikes {


	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
	
	@Column(name="name")
	private  String name;
	
	@Column(name="colour")
	private String colour; ;
	
	@Column(name="model")
	private String model;
	
	@Column(name="price")
	private double price;
	
	
	@Column(name="speed")
	private String  speed;
	
	@Column(name="company_name")
	private  String companyName;
	
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "store_id")
	private Store store;
	
	
	
	
		
	}


