package com.customer.project.controller;

import com.customer.project.entity.Customer;
import com.customer.project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping("/saveAll")
    private  String save(@RequestBody Customer customer) {
        customerService.save(customer);
        return "yes";


    }
    @GetMapping("/getAllCustomers")
    private List<Customer> getAll() {
      return  customerService.getAll();
    }

}
