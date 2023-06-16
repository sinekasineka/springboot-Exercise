package com.photoshop.photoshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.photoshop.photoshop.entity.Shop;
import com.photoshop.photoshop.service.ShopService;

@RestController

public class ShopController {
	@Autowired

	private ShopService shopService;

	@PostMapping("/save")

	private String save(@RequestBody Shop shop) {
		shopService.save(shop);
		return "ok";

	}

}
