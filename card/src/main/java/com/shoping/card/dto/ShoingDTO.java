package com.shoping.card.dto;


import lombok.Data;

@Data
public class ShoingDTO {
    private int id;
    private String name;
    private double price;
    private String qualityName;
    private  String remark;
    private int billNo;
    private double totalAmount;
    private double productAmount;
}
