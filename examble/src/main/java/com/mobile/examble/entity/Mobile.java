package com.mobile.examble.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Setter
@Table(name="mobile_details")

public class Mobile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="mobile_name")
    private String mobileName;
     @Column(name="mobile_colour")
    private String mobileColour;
     @Column(name="mobile_price")
    private double mobilePrice;
    @OneToOne(mappedBy = "mobile")
    private Brand brand;




}
