package com.stationery.stationery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stationery.stationery.entity.ProductDetails;
import com.stationery.stationery.entity.Stationery;
import com.stationery.stationery.repository.ProductDetailsRepository;
import com.stationery.stationery.repository.StationeryRepository;

@Service

public class StationeryService {
	@Autowired
	private StationeryRepository stationeryRepository;

	@Autowired
	private ProductDetailsRepository productRepository;

	public String save(Stationery stationery) {
		stationeryRepository.save(stationery);

		for (ProductDetails obj : stationery.getProduct()) {
			obj.setStationery(stationery);
			productRepository.save(obj);
		}
         return "success";
	}
}
