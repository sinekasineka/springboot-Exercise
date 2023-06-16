package com.hospital.doctor.service;

import com.hospital.doctor.entity.Doctor;
import com.hospital.doctor.repository.DoctorRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service

public class DoctorService {
    @Autowired
     private DoctorRepostory doctorRepostory;
    public String save(Doctor doctor){
        doctorRepostory.saveAndFlush(doctor);
        return "ok";

    }
    public List<Doctor>getAll(){
         return doctorRepostory.findAll();

    }
    public Optional<Doctor>getById(Integer id){
        return doctorRepostory.findById(id);

    }




}
