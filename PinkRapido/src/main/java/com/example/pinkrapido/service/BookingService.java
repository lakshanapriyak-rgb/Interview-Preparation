package com.example.pinkrapido.service;

import com.example.pinkrapido.entity.BookingEntity;
import com.example.pinkrapido.repository.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    @Autowired
    private BookingRepo bookingrepo;
    public BookingEntity savebooking(BookingEntity booking){
        return bookingrepo .save(booking);
    }

    public List<BookingEntity> getAllbooking(){
        return bookingrepo.findAll();
    }
}
