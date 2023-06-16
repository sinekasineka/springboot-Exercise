package com.user.official.controller;

import com.user.official.entity.User;
import com.user.official.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
    @Autowired
  private UserService userService;
    @PostMapping("/save")
    private String save(@RequestBody User user){
        userService.save(user);
        return"ok";

    }

}
