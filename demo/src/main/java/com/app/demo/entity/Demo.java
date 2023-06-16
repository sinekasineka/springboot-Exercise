package com.app.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity

public class Demo {
    public String name;
    public int number;

    public String address;
    public String phoneNumber;

    public Demo(String name,int number,String address,String phoneNumber){
        this.name=name;
        this.number=number;
        this .address=address;
        this.phoneNumber=phoneNumber;

    }
}
