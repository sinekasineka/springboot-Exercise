package com.supermarket.supermarket.dto;

import lombok.Data;

@Data

public class ProductDTO {
    private int id;
    private String productName;
    private int price;
    private String quantity;
    private String discount;
}
