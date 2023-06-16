package com.sports.person.service;

import com.sports.person.entity.Sports;
import com.sports.person.repository.SportsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SportsService {
    @Autowired
    private SportsRepository sportsRepository;

    public String save(Sports sports) {
        sportsRepository.saveAndFlush(sports);
        return "ok";
    }

    public List<Sports> getAll() {
        return sportsRepository.findAll();

    }

    public Optional<Sports> getById(Integer id) {
        return sportsRepository.findById(id);
    }

    public String update(Sports sports) {
        sportsRepository.saveAndFlush(sports);
        return "ok";
    }
    public String deleteById(Integer id){
         sportsRepository.deleteById(id);
         return "deletedsuccessfully";

    }
}