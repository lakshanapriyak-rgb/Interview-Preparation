package com.example.OrderingProcess.controller;

import com.example.OrderingProcess.entity.OrderplacedEntity;
import com.example.OrderingProcess.repository.orderrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private orderrepo orderRepo;

    @PostMapping("/add")
    public OrderplacedEntity addOrder(@RequestBody OrderplacedEntity order){
        return orderRepo.save(order);
    }

    @GetMapping("/all")
    public List<OrderplacedEntity> getAllOrders(){
        return orderRepo.findAll();
    }
}