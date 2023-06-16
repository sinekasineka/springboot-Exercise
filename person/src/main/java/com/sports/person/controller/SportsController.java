package com.sports.person.controller;

import com.sports.person.entity.Sports;
import com.sports.person.service.SportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SportsController {
    @Autowired
  private  SportsService sportsService;
    @PostMapping("/saveAll")
    private String save(@RequestBody Sports sports){
        sportsService.save(sports);
        return"ok";
    }
    @GetMapping("/get")
    private List<Sports> getAll(){
        return sportsService.getAll();
    }
   @GetMapping("/get/{getId}")
    private Optional<Sports>getById(@PathVariable("getId")Integer id){
        return sportsService.getById(id);

   }
   @PutMapping("/updateAll")
    private String update(@RequestBody Sports sports){
        sportsService.update(sports);
        return"ok";
    }
    @DeleteMapping("/delete/{deletedId}")
    private String deleteById(@PathVariable("deletedId")Integer id){
       return sportsService.deleteById(id);
    }


}
