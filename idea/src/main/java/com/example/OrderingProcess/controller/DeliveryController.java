package com.example.OrderingProcess.controller;

import com.example.OrderingProcess.entity.DeliverEntity;
import com.example.OrderingProcess.repository.deliverrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    private deliverrepo deliveryRepo;

    @PostMapping("/add")
    public DeliverEntity addDelivery(@RequestBody DeliverEntity delivery){
        return deliveryRepo.save(delivery);
    }

    @GetMapping("/all")
    public List<DeliverEntity> getAllDelivery(){
        return deliveryRepo.findAll();
    }
}