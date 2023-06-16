package com.hospital.doctor.entity;

import jdk.jfr.Enabled;
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
@Table(name="doctor_detail")

public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
     @Column(name="doctor_name")
    private String doctorName;

     @Column(name="doctor_address")
    private String doctorAddress;
      @Column(name="fees")
    private int fees;

      @Column(name="tablet_name")
    private String tabletName;

      @Column(name="phone_number")
    private long phoneNumber;
}
