package com.stationery.stationery.entity;

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
@Table(name="stationery")


public class Stationery {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
	
	
	@Column(name="name")
	private String name;
	
	
	@Column(name="place")
	private  String place;
	
	
	@Column(name="purchaes_amount")
	private double patchesAmount;
	
	
	@Column(name="sale_product")
	private String saleProduct;
	
	@OneToMany(mappedBy = "stationery",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<ProductDetails> product;
	
	
	
	


}
