package com.stationery.stationery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stationery.stationery.entity.Stationery;
import com.stationery.stationery.service.StationeryService;

@RestController
public class StationeryController {
	@Autowired
	 private StationeryService stationSerive;
	@PostMapping("/save")
	private String save(@RequestBody Stationery stationery) {
		stationSerive.save(stationery);
		return "ok";
	}

}
