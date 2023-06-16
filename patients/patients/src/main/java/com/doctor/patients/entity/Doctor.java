package com.doctor.patients.entity;

import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="doctor")
public class Doctor {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="id")
@Type(type = "uuid-char")
private UUID id;

@Column(name="doctor_name")
private String doctorName;

@Column(name="hospital_name")
private String hospitalName;

@Column(name="phone_number")
private long phoneNumber;

@Column(name="address")
private String address;


@OneToMany(mappedBy = "doctor", fetch = FetchType.LAZY,
cascade = CascadeType.ALL)
private List<Patients> patients;

//@OneToMany(mappedBy = "doctor",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//private List<Peoples> peoples;


}
