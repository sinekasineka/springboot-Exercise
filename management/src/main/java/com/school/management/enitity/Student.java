package com.school.management.enitity;

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
@Table(name="student_detail")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="student_id")
    private int studentId;

    @Column(name="student_name")
    private String studentName;

    @Column(name="student_address")
    private String StudentAddress;

    @Column(name="phone_number")
    private long phoneNumber;

    @Column(name="mail_id")
    private String mailId;

    @OneToOne(cascade = CascadeType.ALL)
    private School school;
}
