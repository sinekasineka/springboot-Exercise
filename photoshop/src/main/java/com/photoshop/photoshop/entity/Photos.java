package com.photoshop.photoshop.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="photos")
	  
public class Photos {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name="id")
	    private int id;
	  
	  
	    @Column(name="price")
	    private int price;
	  
	  
	    @Column(name="size")
	    private String size;
	  
	  
	    @Column(name="quality")
	    private String quality;
	  
	  
	  @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	  @JoinColumn(name="shop_id")
	  private Shop shop;
	  

	  
	  
}
