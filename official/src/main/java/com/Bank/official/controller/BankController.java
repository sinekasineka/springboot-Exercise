package com.Bank.official.controller;

import com.Bank.official.entity.Bank;
import com.Bank.official.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
  @Autowired
private  BankService bankService;
  @PostMapping("/saveAll")
private String save(@RequestBody Bank bank){
      bankService.save(bank);
      return "ok";

  }
}


