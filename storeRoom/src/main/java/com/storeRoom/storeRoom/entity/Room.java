package com.storeRoom.storeRoom.entity;

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

import com.stationery.stationery.entity.ProductDetails;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "room")

	

public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	
	@Column(name="store_name")
	private String StoreName;
	
	
	@Column(name="address")
	private String address;
	
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	
	@Column(name="product_name")
	private String productName;
	
	
	@Column(name="total_ammount")
	private double totalAmmount;
	
	
	@OneToMany(mappedBy = "room",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<ProductDetails> productDetails;
	
	


}
