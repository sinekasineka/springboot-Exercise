package com.user.information.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.information.entity.User;
import com.user.information.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public String save(User user) {
		userRepository.saveAndFlush(user);
		return "ok";
	}

}
