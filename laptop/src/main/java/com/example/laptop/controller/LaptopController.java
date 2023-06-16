package com.example.laptop.controller;

import com.example.laptop.entity.BrandLap;
import com.example.laptop.entity.Laptop;
import com.example.laptop.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController {
    @Autowired
    private LaptopService laptopService;

    @PostMapping("/post")
    private void save(@RequestBody Laptop lap){
        laptopService .save(lap);
    }
}
