package com.student.details.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "student_name")
	private String studentName;

	@Column(name = "register_number")
	private int registerNumber;

	@Column(name = "email_id")
	private String emailId;

	@Column(name = "phone_number")
	private long phoneNumber;

}
