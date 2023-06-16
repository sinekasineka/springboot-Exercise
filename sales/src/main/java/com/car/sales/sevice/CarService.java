package com.car.sales.sevice;

import com.car.sales.entity.Car;
import com.car.sales.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;
    public String save(Car car){
        carRepository.saveAndFlush(car);
        return "ok";
    }

    public List<Car> getCar() {
        return carRepository.findAll();
    }

    public Optional<Car> getCarById(int id) {
        return carRepository.findById(id);
    }
}
