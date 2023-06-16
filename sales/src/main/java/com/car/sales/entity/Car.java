package com.car.sales.entity;


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
@Table(name="car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="car_name")
    private String carName;
    @Column(name="car_colour")
    private String carColour;
     @Column(name="car_size")
    private String carSize;
     @Column(name="car_price")
    private Double carPrice;


}
