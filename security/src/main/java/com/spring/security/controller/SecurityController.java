package com.spring.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.security.entity.Security;
import com.spring.security.service.SecurityService;
@RestController
public class SecurityController {


	
	    @Autowired
	    private  SecurityService securityService;

	    @PostMapping("/save")
	    private String save(@RequestBody  Security  security) {
	    	securityService .save(security);
	        return "success";
	    }

}
