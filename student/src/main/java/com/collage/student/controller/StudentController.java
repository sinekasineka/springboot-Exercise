package com.collage.student.controller;

import com.collage.student.entity.Student;
import com.collage.student.service.StudentService;
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
    }}
