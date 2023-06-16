package com.supermarket.supermarket.entity;

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
@Table(name="product_details")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="product_name")
    private String productName;

    @Column(name="price")
    private int price;

    @Column(name="quantity")
    private String quantity;
    @Column(name="discount")
    private String discount;




}
