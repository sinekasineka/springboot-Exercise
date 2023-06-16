package com.onlineShoping.Shoping.service;

import com.onlineShoping.Shoping.entity.OnlineShoping;
import com.onlineShoping.Shoping.reposittory.OnlineShopingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class OnlineShopingService {
    @Autowired
    private OnlineShopingRepository onlineShopingRepository;

    public String save(OnlineShoping OnlineShoping) {
        onlineShopingRepository.saveAndFlush(OnlineShoping);
        return "ok";
    }
    public List<OnlineShoping> getAll(){
        return onlineShopingRepository.findAll();
    }
}
