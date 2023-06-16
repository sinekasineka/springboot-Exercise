package com.mobile.patches.controller;

import com.mobile.patches.entity.Mobile;
import com.mobile.patches.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MobileController {
    @Autowired
   private MobileService mobileService;
    @PostMapping("/save")
    private String save(@RequestBody Mobile mobile){
        mobileService.save(mobile);
        return"ok";
    }@GetMapping("/getAll")
    private List<Mobile>getAll(){
        return mobileService.getAll();

    }@GetMapping("/get/{id}")
    private Optional<Mobile>getById(@PathVariable("id")Integer id){

       return mobileService.getById(id);
    }@DeleteMapping("/delete/{id}")
    private void delete(@PathVariable("id") Integer id){
        mobileService.delete(id);
    }@PutMapping("/update/{id}")
    private void update(@RequestBody Mobile mobile){
        mobileService.update(mobile);
    }

}
