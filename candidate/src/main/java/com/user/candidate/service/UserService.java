package com.user.candidate.service;

import com.user.candidate.entity.User;
import com.user.candidate.repository.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public String save(User user) {
        userRepository.saveAndFlush(user);
        return "ok";

    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public Optional<User> getById(Integer id) {
        return userRepository.findById(id);
    }

    public String update(User user) {
        userRepository.saveAndFlush(user);
        return "ok";
    }
    public   void delete(Integer id){
        userRepository.deleteById(id);
    }


}

