package com.example.laptop.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "laptop")
public class Laptop {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "laptop_name")
	private String laptopName;
	
	@Column(name = "laptop_color")
	private String laptopColor;

	@Column(name = "laptop_price")
	private int laptopPrice;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_brand_id")
	private BrandLap brandLap;
}