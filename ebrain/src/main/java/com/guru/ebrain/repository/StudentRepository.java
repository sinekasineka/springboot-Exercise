package com.guru.ebrain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guru.ebrain.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
