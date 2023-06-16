package com.parent.child.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="parent")

public class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private  int id;

    @Column(name="name")
    private String name;

    @Column(name="address")
    private String address;

    @Column(name="age")
    private int age;

    @Column(name="job")
    private  String job;

    @Column(name="phone_number")
    private long phoneNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_child_id")
    private Child child ;



}
