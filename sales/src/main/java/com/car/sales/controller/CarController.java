package com.car.sales.controller;

import com.car.sales.entity.Car;

import com.car.sales.sevice.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CarController {
    @Autowired
    private CarService carService;
    @PostMapping("/post")
    public  String save(@RequestBody Car car){
        carService.save(car);
        return "ok";
    }
    @GetMapping("/getCar")
    public List<Car> getCar(){
        return carService.getCar();
    }

    @GetMapping("/getCarById/{id}")
    public Optional<Car> getCarById(@PathVariable int id){
        return carService.getCarById(id);

    }
    @PostMapping("postAll")
    public String postCar(@RequestBody Car car){
        return carService.save(car);
    }



}

