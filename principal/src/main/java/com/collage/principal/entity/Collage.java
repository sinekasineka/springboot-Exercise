package com.collage.principal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="collage")

public class Collage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="collage_name")
    private String collageName;

    @Column(name="collage_address")
    private String collageAddress;

    @Column(name="web_site")
    private String WebSite;

    @Column(name="collage_course")
    private String collageCourse;

    @Column(name="phone_number")
    private long phoneNumber;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn( name="principal_id",referencedColumnName = "id")
    private Principal principal;


}
