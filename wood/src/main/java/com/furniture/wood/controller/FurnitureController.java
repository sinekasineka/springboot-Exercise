package com.furniture.wood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.furniture.wood.dto.FurnitureDTO;
import com.furniture.wood.entity.Furniture;
import com.furniture.wood.service.FurnitureService;

@RestController

public class FurnitureController {
	@Autowired
	private FurnitureService furnitureService;

	@PostMapping("/save")
	private String save(@RequestBody FurnitureDTO furniture) {
		furnitureService.save(furniture);
		return "ok";
	}

}
