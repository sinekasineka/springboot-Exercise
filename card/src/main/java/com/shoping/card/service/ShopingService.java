package com.shoping.card.service;

import com.shoping.card.entity.Shoping;
import com.shoping.card.repository.ShopingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopingService {
    @Autowired
     private ShopingRepository shopingRepository;
    public String save(Shoping shoping){

        shopingRepository.saveAndFlush(shoping);
        return "ok";





    }
}
