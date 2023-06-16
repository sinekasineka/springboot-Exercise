package com.Info.Tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Info.Tech.entity.Employees;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Integer> {

}
