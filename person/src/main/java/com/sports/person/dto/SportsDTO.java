package com.sports.person.dto;

import lombok.Data;

@Data
public class SportsDTO {
    private int id;
    private String sportsName;
    private String personName;
    private String sportsPlace;
    private double firstPrice;
    private double secondPrice;
    private double thirdPrice;
}
