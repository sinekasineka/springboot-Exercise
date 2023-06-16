package com.mobile.examble.controller;

import com.mobile.examble.entity.Mobile;
import com.mobile.examble.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mobile")
public class MobileController {
    @Autowired
    private MobileService mobileService;
    @PostMapping("/save")
    private String save(@RequestBody Mobile mobile){
        mobileService.save(mobile);
        return "saved successfully";

    }


}




