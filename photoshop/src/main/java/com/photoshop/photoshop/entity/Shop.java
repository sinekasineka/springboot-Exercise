package com.photoshop.photoshop.entity;

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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor 
@Entity
@Getter
@Setter
@Table(name="shop")

  
public class Shop {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name="id")
	    private int id;
	    
	    
	    @Column(name="name")
	    private String name;
	    
	    
	    @Column(name="size")
	    private String size;
	    
	    
	    @Column(name="quality")
	    private String quality;
	    
	    
	    
	    @OneToMany(mappedBy = "shop",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	    private List<Photos> photos;
	

}
