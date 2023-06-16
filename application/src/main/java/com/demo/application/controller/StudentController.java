package com.demo.application.controller;

import com.demo.application.entity.Student;
import com.demo.application.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping("/createStudent")
    public Student createStudent(@RequestBody Student student){
        return service.createStudent(student);
    }
}
