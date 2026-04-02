package com.example.OrderingProcess.service;
import  com.example.OrderingProcess.entity.*;
import  com.example.OrderingProcess.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service


public class Orderservice {
    @Autowired
    private orderrepo orderrepo;
    public OrderplacedEntity
    createOrder(OrderplacedEntity order){
        UserEntity user=order.getUser();
        ProductEntity product=order.getProduct();
        PaymentEntity payment=order.getPayment();

        order.setUser(user);
        order.setProduct(product);
        order.setPayment(payment);

        if(user.getDelivery() !=null){
            DeliverEntity deliver=user.getDelivery();
            deliver.setUser(user);

        }
        return orderrepo.save(order);
    }

}
