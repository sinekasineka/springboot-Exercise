package com.exam.aplay.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@Table(name="aplay_details")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="exam_number")
    private int examNumber;
     @Column(name="exam_name")
    private String examName;
      @Column(name="phone_number")
    private Long phoneNumber;
       @Column(name="adher_number")
    private int adherNumber;
        @Column(name="sem_mark")
    private int semMark;

}
