package com.supermarket.customer.controller;

import com.supermarket.customer.entity.Customer;
import com.supermarket.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    private String save(@RequestBody Customer customer) {
        customerService.save(customer);
        return "success";
    }

    @GetMapping("/get")
    private List<Customer> getAll() {
        return customerService.getAll();
    }

    @GetMapping("/get/{id}")
    private Optional<Customer> getById(@PathVariable("id") Integer id) {
        return customerService.getById(id);

    }

    @PostMapping("/postAll")
    private String save(@RequestBody List<Customer> customer) {
        customerService.save(customer);
        return "ok";
    }

    @DeleteMapping("/delete/{id}")
    private void delete(@PathVariable("id") Integer id) {
        customerService.delete(id);
    }

    @PutMapping("/update/{id}")
    private void update(@RequestBody Customer customer) {
        customerService.update(customer);
    }

}