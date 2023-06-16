	package com.furniture.wood.dto;

import java.util.List;

import com.furniture.wood.entity.Wood;

import lombok.Data;

@Data

public class FurnitureDTO {

	private int id;

	private String name;

	private String brand;

	private String colour;

	private double price;

	private int quantity;

	private String quality;
	
	List<WoodDTO> woodList;

}
