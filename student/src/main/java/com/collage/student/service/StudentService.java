package com.collage.student.service;

import com.collage.student.entity.Student;
import com.collage.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
     private StudentRepository studentRepository;
    public String save(Student student){
        studentRepository.saveAndFlush(student);
        return "ok";

    }public List<Student> getAll(){
         return studentRepository.findAll();


    }public Optional<Student>getById(Integer id){
        return studentRepository.findById(id);


    }

}
