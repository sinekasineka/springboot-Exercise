package com.guru.ebrain.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "school")
public class School {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "school_id")
	private int id;
	@Column(name = "school_name")
	private String name;
	@Column(name = "school_address")
	private String address;

	@OneToMany(mappedBy = "schools", fetch = FetchType.LAZY, cascade = CascadeType.ALL)

	List<Student> lists;
}
