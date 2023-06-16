package com.demo.app.repository;

import com.demo.app.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface    StudentRepository extends JpaRepository<Student, UUID> {
    Optional<Student> findByName(String name);
}
