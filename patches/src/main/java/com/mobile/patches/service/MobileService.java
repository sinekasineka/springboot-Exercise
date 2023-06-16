package com.mobile.patches.service;

import com.mobile.patches.entity.Mobile;
import com.mobile.patches.repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class MobileService {
    @Autowired
    private MobileRepository mobileRepository;
    public String save(Mobile mobile){
        mobileRepository.saveAndFlush(mobile);
        return"ok";
    }
    public List<Mobile>getAll(){
         return mobileRepository.findAll();
    }
    public Optional<Mobile>getById(Integer id){
        return mobileRepository.findById(id);
    }
    public void delete(Integer id){
        mobileRepository.deleteById(id);
    }
    public void update( Mobile mobile){
        mobileRepository.saveAndFlush(mobile);
    }

    }

