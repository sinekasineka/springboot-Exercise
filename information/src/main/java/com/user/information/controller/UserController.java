package com.user.information.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.information.entity.User;
import com.user.information.service.UserService;

@RestController

public class UserController {
	@Autowired
	private  UserService userService;
	@PostMapping("/save")
	private String save(@RequestBody User User) {
		userService.save(User);
		return "ok";
	}

}
