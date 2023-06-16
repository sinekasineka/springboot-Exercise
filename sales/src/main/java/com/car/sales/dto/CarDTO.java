package com.car.sales.dto;

import lombok.Data;

@Data
public class CarDTO {
    private int id;
    private String carName;
    private String carColour;
    private String carSize;
    private Double carPrice;
}
