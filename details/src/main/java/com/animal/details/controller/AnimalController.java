package com.animal.details.controller;

import com.animal.details.entity.Animal;
import com.animal.details.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController {
    @Autowired
     private AnimalService animalService;
    @PostMapping("/saveAll")
    private String save(@RequestBody Animal animal){
        animalService.save(animal);
        return "okk";
    }


    @GetMapping("/getAllAnimal")
    private List<Animal>getAll(){
        return animalService.getAll();
    }
}
