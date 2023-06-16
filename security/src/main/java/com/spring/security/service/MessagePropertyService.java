package com.spring.security.service;

import java.util.Locale;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class MessagePropertyService {

	@Autowired
	private MessageSource messageSource;

	public String getMessage(String key) {
		return messageSource.getMessage(key,null, Locale.ENGLISH) ;
	}

	public String getMessage1(String key,String[] params) {
		return messageSource .getMessage(key,params,Locale.ENGLISH);
		

}
}