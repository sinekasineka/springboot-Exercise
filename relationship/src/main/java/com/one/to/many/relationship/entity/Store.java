package com.one.to.many.relationship.entity;

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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="store")	

public class Store {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="mobile_number")
	private long mobileNumber;
	
	
	
	
	@OneToMany(mappedBy = "store",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<Bikes> bikes;
	
	

}
