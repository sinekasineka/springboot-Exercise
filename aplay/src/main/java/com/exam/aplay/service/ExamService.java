package com.exam.aplay.service;

import com.exam.aplay.entity.Exam;
import com.exam.aplay.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;

@Service

public class ExamService {
    @Autowired
   private ExamRepository examRepository;
    public String save(Exam exam){
        examRepository.saveAndFlush(exam);
        return "ok";
    }
    public List<Exam>getAll(){
      return   examRepository.findAll();
    }
    public Optional<Exam>getById(Integer id){
        return examRepository.findById(id);


    }
    public void delete(Integer id){
        examRepository.deleteById(id);
    }

    public void update(Exam exam){
        examRepository.saveAndFlush(exam);

    }


    }
