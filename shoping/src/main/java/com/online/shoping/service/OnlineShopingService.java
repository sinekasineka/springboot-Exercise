package com.online.shoping.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.online.shoping.entity.Customer;
import com.online.shoping.entity.OnlineShopping;
import com.online.shoping.repository.CustomerRepository;
import com.online.shoping.repository.OnlineShoppingRepository;

public class OnlineShopingService {
	
	@Autowired
	private OnlineShoppingRepository  onlineShoppingRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
//	@Autowired
//	private ProductRepository productRepository;
	
	public String save(OnlineShopping onlineShopping) {
		onlineShoppingRepository.save(onlineShopping);
		
		 for(Customer obj:onlineShopping.getCustomer()) {
			 obj.setOnlineShopping(onlineShopping);
			 customerRepository.save(obj);
				
		 }
		return "success";
	}
}
