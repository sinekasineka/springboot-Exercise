package com.springBoot.JwtTokens.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;

import com.springBoot.JwtTokens.service.UserService;

public class UserController {
	@Autowired
	private UserService userService;
	
	@PutMapping
	@Transactional(rollbackOn = Exception.class) 
	public String saveDto(UserDto userDto) { 
	    userDto.setPassword(bCryptPasswordEncoder
	           .encode(userDto.getPassword())); 
	    return save(new User(userDto)).getId(); 

}
