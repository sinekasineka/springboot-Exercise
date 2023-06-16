package com.spring.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.customer.project.repository.CustomerRepository;
import com.spring.security.entity.Security;
import com.spring.security.repository.SecurityRepository;

@Service
public class SecurityService {

	
	    @Autowired
	    private SecurityRepository securityRepository;

	    public String save(Security Security) {
	    	securityRepository.saveAndFlush( Security);
	        return "success";
	    }


}
