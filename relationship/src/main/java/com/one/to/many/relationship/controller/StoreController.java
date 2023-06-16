package com.one.to.many.relationship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.one.to.many.relationship.entity.Store;
import com.one.to.many.relationship.service.StoreService;

@RestController

public class StoreController {
	@Autowired
	 private StoreService storeService;
	@PostMapping("/save")
	private String save(@RequestBody Store store) {
		storeService.save(store);
		return "ok";
		
	}

}
