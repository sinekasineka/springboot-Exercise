package com.user.official.service;

import com.user.official.entity.User;
import com.user.official.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserService {
    @Autowired
    private UserRepository userRepository;
    public  String save(User user){
        userRepository.saveAndFlush(user);
        return"ok";
    }
}
