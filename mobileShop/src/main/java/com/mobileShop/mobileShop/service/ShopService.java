package com.mobileShop.mobileShop.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mobileShop.mobileShop.entity.Mobile;
import com.mobileShop.mobileShop.entity.Shop;
import com.mobileShop.mobileShop.repository.MobileRepository;
import com.mobileShop.mobileShop.repository.ShopRepository;

public class ShopService {
	@Autowired
	private ShopRepository shopRepository;

	@Autowired
	private MobileRepository mobileRepository;

	public String save(Shop shop) {
		shopRepository.save(shop);

		for (Mobile obj : shop.getMobile()) {
			obj.setShop(shop);
			mobileRepository.save(obj);

		}

		return "success";

	}

}
