package com.user.official.entity;

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
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="user_name")
    private String userName;
    @Column(name="user_address")
    private String userAddress;
    @Column(name="phone_number")
    private long phoneNumber;
    @Column(name="email_Id")
    private String emailId;
    @Column(name="qualification")
    private String qualification;

    @Column(name="district")
    private String district;
    @Column(name="dob")
    private double dob;
    @Column(name="age")
    private int age;

}
