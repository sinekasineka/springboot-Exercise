package com.sports.person.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name="sports")
public class Sports {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name="sports_name")
    private String sportsName;
     @Column(name="person_name")
     private String personName;
    @Column(name="sports_place")
    private String sportsPlace;
     @Column (name=" first_price")
    private double firstPrice;
      @Column(name="second_price")
    private double secondPrice;
      @Column(name="third_price")
    private double thirdPrice;

}
