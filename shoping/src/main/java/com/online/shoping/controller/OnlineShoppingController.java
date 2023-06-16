package com.online.shoping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.online.shoping.entity.OnlineShopping;
import com.online.shoping.service.OnlineShopingService;

@RestController


public class OnlineShoppingController {
	@Autowired
	private OnlineShopingService onlineShoppingService;
	
	@PostMapping("/save")
    private String save( @RequestBody OnlineShopping onlineShopping ) {
		onlineShoppingService.save(onlineShopping);
		return "ok";
		
	}

}
