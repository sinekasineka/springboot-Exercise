package com.doctor.patients.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctor.patients.entity.Patients;

@Repository
public interface PatientsRepository extends JpaRepository<Patients, UUID>{

}
