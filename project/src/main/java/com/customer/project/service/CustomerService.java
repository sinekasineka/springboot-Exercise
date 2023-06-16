package com.customer.project.service;

import com.customer.project.entity.Customer;
import com.customer.project.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public String save(Customer customer) {
        customerRepository.saveAndFlush(customer);
        return "yes";
    }

    public List<Customer> getAll() {
       return customerRepository.findAll();

    }
}





