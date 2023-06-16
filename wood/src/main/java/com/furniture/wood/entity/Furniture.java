package com.furniture.wood.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "furniture")

public class Furniture {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "brand")
	private String brand;

	@Column(name = "colour")
	private String colour;

	@Column(name = "price ")
	private double price;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "quality")
	private String quality;
	
	@JsonIgnore
	@OneToMany(mappedBy = "furniture",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<Wood>woods;

	

}
