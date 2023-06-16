package com.photoshop.photoshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.photoshop.photoshop.entity.Photos;
import com.photoshop.photoshop.entity.Shop;
import com.photoshop.photoshop.repository.PhotosRepository;
import com.photoshop.photoshop.repository.ShopRepository;

@Service

public class ShopService {
	
	
	@Autowired

	private ShopRepository shopRepository;

	@Autowired
	private PhotosRepository photosRepository;

	public String save(Shop shop) {
		shopRepository.save(shop);
		
		for(Photos obj :  shop.getPhotos()) {
			obj.setShop(shop);
			photosRepository.save(obj);
			

	}
	return "success";
	

}
}