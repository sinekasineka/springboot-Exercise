package com.product.meterials.dto;



import java.util.Date;

import lombok.Data;


@Data
public class ProductDTO {
	
	private String productName;

	
	private String productType;

	
	private int quantity;

	
	private String description;

	
	private double rawMaterialAmount;

	
	private String modifiedBy;
	
	
	private Date modifiedOn;

	
	private String createdBy;

	
	private Date createdOn;

	
	private String deletedBy;

	
	private Date deletedOn;

	
}





