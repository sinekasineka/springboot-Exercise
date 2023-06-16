package com.supermarket.supermarket.controller;

import com.supermarket.supermarket.entity.Product;
import com.supermarket.supermarket.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class ProductController {
    @Autowired
     private ProductService productService;
    @PostMapping("/save")
    private String save(@RequestBody Product product) {
        productService.save(product);
        return "ok";
    }@GetMapping("/getAll")
    private List<Product> getAll(){
          return   productService.getAll();

    }@GetMapping("/get/{id}")
    private Optional<Product>getById(@PathVariable("id") Integer id){
        return productService.getById(id);

    }@DeleteMapping("/delete/{id}")
    private void delete(@PathVariable("id") Integer id){
         productService.delete(id);
    }
    }



