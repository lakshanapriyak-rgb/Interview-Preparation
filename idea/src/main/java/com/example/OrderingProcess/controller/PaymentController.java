package com.example.OrderingProcess.controller;

import com.example.OrderingProcess.entity.PaymentEntity;
import com.example.OrderingProcess.repository.paymentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private paymentrepo paymentRepo;

    @PostMapping("/add")
    public PaymentEntity addPayment(@RequestBody PaymentEntity payment)
    {
        return paymentRepo.save(payment);
    }

    @GetMapping("/all")
    public List<PaymentEntity> getAllPayments(){
        return paymentRepo.findAll();
    }
}