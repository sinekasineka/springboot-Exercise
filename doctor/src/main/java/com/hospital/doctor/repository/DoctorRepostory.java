package com.hospital.doctor.repository;

import com.hospital.doctor.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface DoctorRepostory extends JpaRepository<Doctor,Integer> {

}
