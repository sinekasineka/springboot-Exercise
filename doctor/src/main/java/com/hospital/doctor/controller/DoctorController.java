package com.hospital.doctor.controller;

import com.hospital.doctor.entity.Doctor;
import com.hospital.doctor.repository.DoctorRepostory;
import com.hospital.doctor.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @PostMapping("/save")
    private String save(@RequestBody Doctor doctor) {
        doctorService.save(doctor);
        return "ok";
    }@GetMapping("/get")
    private List<Doctor> getAll(){
      return   doctorService.getAll();

    }@GetMapping("/get/{id}")
    private Optional<Doctor>getById(@PathVariable("id") Integer id){
       return doctorService.getById(id);
    }
}