package com.app.sample.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.app.sample.dto.UserDto;
import com.app.sample.entity.User;
import com.app.sample.swaggerconfig.WriteableRepository;

@Repository
public interface UserRepository extends WriteableRepository<User,UUID>{

	ResponseEntity<?> saveAndFlush(User userObj);

	

	Optional<User> findByUserName(String userName);

	
}
