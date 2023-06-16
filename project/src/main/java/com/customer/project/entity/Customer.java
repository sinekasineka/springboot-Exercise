package com.customer.project.entity;

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
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "customer_place")
    private String customerPlace;
    @Column(name = "phone_number")
    private long phoneNumber;
    @Column(name = "customer_address")
    private String customerAddress;
    @Column(name = "customer_district")
    private String customerDistrict;
}
