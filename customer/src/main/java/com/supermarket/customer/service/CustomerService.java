package com.supermarket.customer.service;

import com.supermarket.customer.entity.Customer;
import com.supermarket.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public String save(Customer customer) {
        customerRepository.saveAndFlush(customer);
        return "success";
    }

    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getById(Integer id) {
        return customerRepository.findById(id);

    }

    public String save(List<Customer> customer) {
        Customer customer1;
        for (Customer a : customer) {
            customer1 = new Customer();
            customer1.setCustomerName(a.getCustomerName());
            customer1.setCustomerAddress(a.getCustomerAddress());
            customer1.setPhoneNumber(a.getPhoneNumber());
            customer1.setPatchesAmount(a.getPatchesAmount());
            customer1.setPatchesProduct(a.getPatchesProduct());
            customer1.setProductQuantity(a.getProductQuantity());
            customer1.setProductDiscount(a.getProductDiscount());
            customerRepository.saveAndFlush(customer1);
        }

        return "success";


    }

    public void delete(Integer id) {
        customerRepository.deleteById(id);

    }

    public String update(Customer customer) {
        customerRepository.saveAndFlush(customer);
        return "success";

    }


}
