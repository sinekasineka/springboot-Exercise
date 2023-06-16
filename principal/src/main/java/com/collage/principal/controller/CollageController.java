package com.collage.principal.controller;

import com.collage.principal.entity.Collage;
import com.collage.principal.service.CollageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollageController {
    @Autowired
     private CollageService collageService;
    @PostMapping("/save")
    private  String save(@RequestBody Collage collage){
        collageService.save(collage);
        return "ok";
    }
}
