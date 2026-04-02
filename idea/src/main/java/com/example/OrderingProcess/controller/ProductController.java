package com.example.OrderingProcess.controller;

import com.example.OrderingProcess.entity.ProductEntity;
import com.example.OrderingProcess.repository.productrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private productrepo productRepo;

    @PostMapping("/add")
    public ProductEntity addProduct(@RequestBody ProductEntity product){
        return productRepo.save(product);
    }

    @GetMapping("/all")
    public List<ProductEntity> getAllProducts(){
        return productRepo.findAll();
    }
}