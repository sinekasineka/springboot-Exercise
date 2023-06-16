package com.mobile.patches.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
        @Entity
@Getter
@Setter
@Table(name="mobile_patches")
public class Mobile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="mobile_brand")
    private String mobileBrand;
     @Column(name="mobile_colour")
    private String mobileColour;

     @Column(name="mobile_size")
    private int mobileSize;
     @Column(name="mobile_price")
    private double mobilePrice;

}
