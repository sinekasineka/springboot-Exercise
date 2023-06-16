package com.spring.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.spring.security.entity.Security;


public interface SecurityRepository extends JpaRepository<Security, Integer>{

	

}
