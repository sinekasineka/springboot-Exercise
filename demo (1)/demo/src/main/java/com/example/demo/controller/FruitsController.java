package com.example.demo.controller;

import com.example.demo.entity.Fruits;
import com.example.demo.service.FruitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
public class    FruitsController {
    @Autowired
    private FruitsService fruitsService;
    @PostMapping("/saveAll")
    private String save(@RequestBody Fruits fruits){
        fruitsService.save(fruits);
        return "ok";
     }
     @GetMapping("/getById/{id}")
    private Optional<Fruits> getById(@PathVariable Integer id){
        return fruitsService.getById(id);
     }


}
