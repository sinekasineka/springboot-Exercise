package com.school.management.service;

import com.school.management.enitity.School;
import com.school.management.repository.SchoolRepository;
import com.school.management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;
    @Autowired

    private StudentRepository studentRepository;
    public void save(School school){
        schoolRepository.save(school);
    }

}
