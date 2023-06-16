package com.demo.application.service;

import com.demo.application.entity.Student;
import com.demo.application.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
  private  StudentRepository repository;
    public Student createStudent(Student student) {
        return repository.saveAndFlush(student);
    }
}
