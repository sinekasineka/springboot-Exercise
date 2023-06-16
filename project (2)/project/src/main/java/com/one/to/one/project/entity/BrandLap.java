package com.one.to.one.project.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="brand_detail")



public class BrandLap {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int brandId;
	
	
	
	@Column(name="brand_name")
	private String brandName;
	
	
	@Column(name="price")
	private double price;
	
	
	@Column(name="quantity")
	private int quantity;
	
	
	@Column(name="quality")
	private String quality;
	
	@OneToOne(mappedBy = "brandLap",cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_laptop_id")
	private Laptop laptop;

}
