package com.user.candidate.controller;

import com.user.candidate.entity.User;
import com.user.candidate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@RestController

public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    private String save(@RequestBody User user) {
        userService.save(user);
        return "ok";
    }
    @GetMapping("/get")
    private List<User> getAll(){
        return userService.getAll();
    }
    @GetMapping("/get/{id}")
            private Optional<User>getById(@PathVariable("id")Integer id){
         return  userService.getById(id);
    }
    @PutMapping ("/update/{id}")
    private void update(@RequestBody User user){
        userService.update(user);

    }
    @DeleteMapping("/delete/{id}")
    private void delete(@PathVariable("id")Integer id){
        userService.delete(id);
    }
    
    
    @OneToMany(mappedBy = "students", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
            
    private List<teacher> teacher;
}