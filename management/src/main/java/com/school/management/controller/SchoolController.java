package com.school.management.controller;

import com.school.management.enitity.School;
import com.school.management.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {
    @Autowired
     private  SchoolService schoolService;
    @PostMapping("/save")
    private  void save(@RequestBody School school){
        schoolService.save(school);

    }
}
