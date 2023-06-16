package com.Bank.official.service;

import com.Bank.official.entity.Bank;
import com.Bank.official.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {
    @Autowired
 private BankRepository bankRepository;
    public  String save (Bank bank){
        bankRepository.saveAndFlush(bank);
        return "ok";
    }
}





