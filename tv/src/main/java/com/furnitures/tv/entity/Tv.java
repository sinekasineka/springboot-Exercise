package com.furnitures.tv.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="tv_patches ")
public class Tv {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="tv_name")
    private String tvName;

    @Column(name="tv_brand")
    private String tvBrand;
     @Column(name="tv_size")
    private int tvSize;

     @Column(name="tv_price")
    private double tvPrice;

     @Column(name="tv_colour")
    private String tvColour;

}
