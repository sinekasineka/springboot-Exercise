package com.student.marklists.entity;

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
@Table(name="student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="student_name")
    private String studentName;
    @Column(name="roll_number")
    private  int rollNumber;
    @Column(name="register_number")
    private int registerNumber;
    @Column(name="email_id")
    private String emailId;
     @Column(name="address")
    private String address;
     @Column(name="district")
    private String district;

     @Column(name="course_name")
    private String courseName;
     @Column(name="phone_number")
    private long phoneNumber;

}
