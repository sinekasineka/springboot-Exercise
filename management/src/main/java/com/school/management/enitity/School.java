package com.school.management.enitity;

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
@Table(name="school")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private  int id;
     @Column(name="school_name")
    private int schoolName;
    @Column(name="school_address")
    private int schoolAddress;


    @OneToOne(mappedBy = "student")
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;

}
