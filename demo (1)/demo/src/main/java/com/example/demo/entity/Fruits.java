package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name ="fruits")
public class Fruits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="fruit_name")
    private String fruitName;
    @Column(name="fruit_colour")
    private String fruitColour;
    @Column(name="price")
    private double price;
    @Column(name="fruit_size")
    private  String size;
    @Column(name="quantity")
    private  String quantity;


}