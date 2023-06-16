package com.student.marklists.service;

import com.student.marklists.entity.Student;
import com.student.marklists.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
     private StudentRepository studentRepository;
    public String save(Student student){
         studentRepository.saveAndFlush(student);
        return "ok";
    }

   public  List<Student> getAll1(){
        return   studentRepository.findAll();
    }

    public Optional<Student> getById(Integer id) {
        return studentRepository.findById(id);
    }@GetMapping("/GET")
    public List<Student>getAll(){
        return studentRepository.findAll();

    }
}
