package com.collage.principal.service;

import com.collage.principal.entity.Collage;
import com.collage.principal.repository.CollageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CollageService {
    @Autowired
     private CollageRepository collageRepository;
    public  String save(Collage collage){
        collageRepository.saveAndFlush(collage);
        return "ok";
    }
}
