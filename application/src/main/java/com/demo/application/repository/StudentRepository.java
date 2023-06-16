package com.demo.application.repository;

import com.demo.application.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.UUID;

@Repository
public interface StudentRepository extends JpaRepository<Student, UUID> {
}
