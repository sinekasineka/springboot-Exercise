package com.parent.child.service;

import com.parent.child.entity.Parent;
import com.parent.child.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ParentService {
    @Autowired
     private ParentRepository parentRepository;
    public String save(Parent parent){
        parentRepository.saveAndFlush(parent);
        return "ok";
    }
}
