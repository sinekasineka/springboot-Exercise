package com.animal.details.service;


import com.animal.details.entity.Animal;
import com.animal.details.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {
    @Autowired
 private AnimalRepository animalRepository;



    public String save(Animal animal){
        animalRepository.saveAndFlush(animal);
        return "okk";

    }public List<Animal>getAll(){
        return animalRepository.findAll();
    }

}
