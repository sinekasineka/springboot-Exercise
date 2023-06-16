 package com.one.to.many.relationship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.one.to.many.relationship.entity.Bikes;
import com.one.to.many.relationship.entity.Store;
import com.one.to.many.relationship.repository.BikesRepository;
import com.one.to.many.relationship.repository.StoreRepository;



@Service

public class StoreService {
	@Autowired
	private StoreRepository storeRepository;
	@Autowired
	private BikesRepository bikesRepository;

	public String save(Store store) {
		storeRepository.save(store);
		
		for(Bikes obj:store.getBikes()) {
			obj.setStore(store);
			bikesRepository.save(obj);
		}
		return "success";
	}

	
	}
