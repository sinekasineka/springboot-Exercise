package com.furniture.wood.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furniture.wood.dto.FurnitureDTO;
import com.furniture.wood.dto.WoodDTO;
import com.furniture.wood.entity.Furniture;
import com.furniture.wood.entity.Wood;
import com.furniture.wood.repository.FurnitureRepository;
import com.furniture.wood.repository.WoodRepository;

@Service

public class FurnitureService {
	@Autowired
	private FurnitureRepository furnitureRepository;

	@Autowired
	private WoodRepository woodRepository;

	public void save(FurnitureDTO furniture) {

		Furniture fruni = new Furniture();
		fruni.setBrand(furniture.getBrand());
		fruni.setColour(furniture.getColour());
		Furniture furniture2 = furnitureRepository.save(fruni);
		List<Wood> list = new ArrayList<>();
		for (WoodDTO obj : furniture.getWoodList()) {
			Wood wood=new Wood();
			wood.setId(obj.getId());
			wood.setFurnitureId(furniture2.getId());
			wood.setQuality(obj.getQuality());
			list.add(wood);
		}
		fruni.setWoods(list);
		furnitureRepository.save(fruni);
	}

}