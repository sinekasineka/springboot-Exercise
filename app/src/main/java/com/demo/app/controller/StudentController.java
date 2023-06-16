package com.demo.app.controller;

import com.demo.app.entity.Student;
import com.demo.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class StudentController {


    @Autowired
    StudentService service;

    @PostMapping("/createStudent")
    public Student createStudent(@RequestBody Student student){

        return service.createStudent(student);
    }

    @GetMapping("/getStudent")
    public List<Student> getStudent(){
        return service.getStudent();
    }

    @GetMapping("/getStudentById/{name}")
    public Optional<Student> getStudentById(@PathVariable String name){
        return service.getStudentById(name);

    }
}
