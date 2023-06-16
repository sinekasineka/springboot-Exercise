package com.supermarket.customer.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name="customer_table")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="customer_name")
    private String customerName;

    @Column(name="customer_address")
    private String customerAddress;

    @Column(name="phone_number")
    private long phoneNumber;

    @Column(name="patches_amount")
    private double patchesAmount;

    @Column(name="patches_product")
    private String  patchesProduct;


    @Column(name="product_quantity")
    private String productQuantity;

    @Column(name="product_discount")
    private String productDiscount;



}
