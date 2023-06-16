package com.storeRoom.storeRoom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.storeRoom.storeRoom.entity.ProductDetails;
import com.storeRoom.storeRoom.entity.Room;
import com.storeRoom.storeRoom.repository.ProductDetailsRepository;
import com.storeRoom.storeRoom.repository.RoomRepository;

@Service

public class RoomService {
	@Autowired
	private RoomRepository roomRepository;
	@Autowired
	private ProductDetailsRepository productDetailsRepository;
	
	
	public String save(Room room) {
		roomRepository.save(room);
		
		
		for(ProductDetails obj:room .getproductDetails()) {
			obj.setRoom(room);
			productDetailsRepository.save(obj);
		}
		
		return "success";
	}

}
