package com.product.meterials.dto;

import lombok.Data;

@Data

public class OutputProductDTO {
     private int id;
	
	
	private String productName;
	
	
	private String  quantity;
	
	private String uom;
	
	
	private int price;
	
	
	private double totalAmount;

}
