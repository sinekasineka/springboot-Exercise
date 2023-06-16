package com.shoping.card.controller;

import com.shoping.card.entity.Shoping;
import com.shoping.card.service.ShopingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopingController {
    @Autowired
     private ShopingService shopingService;
    @PostMapping("/post")
    private  String save(@RequestBody Shoping shoping){
        shopingService.save(shoping);
        return "ok";
    }

}
