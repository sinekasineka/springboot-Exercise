package com.parent.child.controller;

import com.parent.child.entity.Parent;
import com.parent.child.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class parentController {
    @Autowired
     private ParentService parentService;
    @PostMapping("/saveAll")
    private  String save(@RequestBody Parent parent){
        parentService.save(parent);
        return "ok";
    }
}
