package com.SuperMarket.simpleProject.entity;



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
@Table(name = "customer_details")

public class CustomerDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	
	@Column(name="customer_name")
	private String customerName;
	
	
	@Column(name="customer_address")
	private String customerAddress;
	
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	
	@Column(name="product_name")
	private String productName;
	
	
	@Column(name="product_price")
	private double productPrice;
	
	
	@Column(name="modified_on")
	private Date modifiedOn;
	
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	
	@Column(name="created_on")
	private Date createdOn;
	
	
	@Column(name="created_by")
	private String  createdBy;
	
	
	@Column(name="deleted_on")
	private Date deletedOn;
	
	
	@Column(name="deleted_by")
	private String deletedBy;
	
	
	
	
	

}
