package com.parent.child.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="child")
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="child_id")
    private int childId;

    @Column(name="child_name")
    private String childName;

    @Column(name="address")
    private String address;

    @Column(name="age")
    private int age;

    @Column(name="job")
    private String job;


}
