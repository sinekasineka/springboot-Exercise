package com.student.marklists.controller;

import com.student.marklists.entity.Student;
import com.student.marklists.repository.StudentRepository;
import com.student.marklists.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class StudentController {
    @Autowired
     private StudentService studentService;
    @PostMapping("/save")
    private String save(@RequestBody Student student){
        studentService.save(student);
        return "ok";


    }@GetMapping("/get")
    private List<Student> getAll1(){
        return studentService.getAll();


    }@GetMapping("/get")
    private List<Student> getAll(){
        return studentService.getAll();
    } 


}
