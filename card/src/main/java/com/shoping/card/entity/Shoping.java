package com.shoping.card.entity;


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
@Table(name="shoping_card")
public class Shoping {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
     @Column(name=" product_name")
    private String productName;
      @Column(name="price")
    private double price;
      @Column(name="quality")
    private String quality;
      @Column(name="remark")
    private  String remark;
      @Column(name="bill_no")
    private int billNo;
      @Column(name="total_amount")
    private double totalAmount;
      @Column(name="product_amount")
    private double productAmount;
}
