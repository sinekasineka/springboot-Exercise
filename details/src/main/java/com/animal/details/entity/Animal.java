package com.animal.details.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "animal")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "animal_name")
    private String animalName;

    @Column(name = "animal_colour")
    private String animalColour;

    @Column(name = "animal_sound")
    private String animalSound;
    @Column(name = "animal_size")
    private String animalSize;


}
