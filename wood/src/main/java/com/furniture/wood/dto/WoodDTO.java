package com.furniture.wood.dto;



import lombok.Data;

@Data
public class WoodDTO {
	
	private int id;

	private String woodType;

	private String quality;

	private double saleAmount;

	private String uom;
	
	private int furnitureId;

}
