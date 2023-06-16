package com.demo.app.service;

import com.demo.app.entity.Student;
import com.demo.app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public Student createStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> getStudent() {
        return (List<Student>) repository.findAll();
    }

    public Optional<Student> getStudentById(String name) {
        return repository.findByName(name);
    }
}
