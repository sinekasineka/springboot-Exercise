package com.onlineShoping.Shoping.controller;

import com.onlineShoping.Shoping.entity.OnlineShoping;
import com.onlineShoping.Shoping.service.OnlineShopingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OnlineShopingController {
    @Autowired
     private OnlineShopingService onlineShopingService;

    @PostMapping("/save")
    private String save(@RequestBody OnlineShoping onlineShoping){
        onlineShopingService.save(onlineShoping);
        return "ok";
    }
    @GetMapping("/getAll")
    private List<OnlineShoping> getAll(){
         return onlineShopingService.getAll();
    }

}
