package com.exam.aplay.controller;

import com.exam.aplay.entity.Exam;
import com.exam.aplay.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class ExamController {
    @Autowired
    private ExamService examService;
    @PostMapping("/save")
    private String save(@RequestBody Exam exam){
        examService.save(exam);
        return "ok";

    }@GetMapping("/get")
    private List<Exam> getAll(){
     return   examService.getAll();

    }@GetMapping("/get/{id}")
    private Optional<Exam> getById(@PathVariable("id") Integer id){
       return examService.getById(id);

    }@DeleteMapping("/delete/{id}")
    private void delete(@PathVariable("id")Integer id){
        examService.delete(id);
    }@PutMapping("/update/{id}")
    private  void update(@RequestBody Exam exam){
        examService.update(exam);

    }




}
