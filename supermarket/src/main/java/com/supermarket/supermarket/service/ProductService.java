package com.supermarket.supermarket.service;

import com.supermarket.supermarket.entity.Product;
import com.supermarket.supermarket.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
     private  ProductRepository productRepository;
    public  String save(Product product){

        productRepository.saveAndFlush(product);
        return "ok";
    }
    public List<Product> getAll(){
return productRepository.findAll();
    }
    public Optional<Product>getById(Integer id){
        return productRepository.findById(id);

    }
    public void delete(Integer id){
        productRepository.findById(id);
    } 
}
