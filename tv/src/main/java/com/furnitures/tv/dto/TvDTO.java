package com.furnitures.tv.dto;

import lombok.Data;

import javax.persistence.Column;

@Data

public class TvDTO {
    private int id;
    private String tvName;
    private String tvBrand;

    private int tvSize;
    private double tvPrice;
    private String tvColour;

}
