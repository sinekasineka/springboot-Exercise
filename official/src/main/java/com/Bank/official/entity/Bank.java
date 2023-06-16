package com.Bank.official.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name="bank")
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private  int id;
    @Column(name="bank_name")
    private String bankName;
    @Column(name="branch_name")
    private String branchName;
    @Column(name="address")
    private  String address;
    @Column(name="district")
    private String district ;
    @Column(name="phone_number")
    private int phoneNumber;



}

