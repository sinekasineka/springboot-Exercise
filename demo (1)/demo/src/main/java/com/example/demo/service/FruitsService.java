package com.example.demo.service;

import com.example.demo.entity.Fruits;
import com.example.demo.repository.FruitsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FruitsService {
    @Autowired
    private FruitsRepository fruitsRepository;
    public String save(Fruits fruits){
        fruitsRepository.saveAndFlush(fruits);
        return "ok";
    }
    public Optional<Fruits> getById(Integer id){
        return fruitsRepository.findById(id);
    }



}
