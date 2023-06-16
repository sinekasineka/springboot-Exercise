package com.example.laptop.service;


import com.example.laptop.entity.Laptop;
import com.example.laptop.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repository;

    public void save(Laptop laptop){

        repository.save(laptop);
    }
}
