package com.mobile.examble.service;

import com.mobile.examble.entity.Brand;
import com.mobile.examble.entity.Mobile;
import com.mobile.examble.repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class MobileService {
    @Autowired
    private MobileRepository mobileRepository;
    public void save(Mobile mobile){
        mobileRepository.saveAndFlush(mobile);
    }

}
