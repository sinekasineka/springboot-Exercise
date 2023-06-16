package com.example.EbrainTechnologies.sampleProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EbrainTechnologies.sampleProject.entity.EmployeeDetails;


@Repository

public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails, Integer>{
	

}
