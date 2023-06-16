package com.storeRoom.storeRoom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.storeRoom.storeRoom.entity.Room;
import com.storeRoom.storeRoom.service.RoomService;

@RestController

public class RoomController {
	@Autowired
	private RoomService roomService;

	private String save(Room room) {
		roomService.save(room);
		return "ok";
	}

}
