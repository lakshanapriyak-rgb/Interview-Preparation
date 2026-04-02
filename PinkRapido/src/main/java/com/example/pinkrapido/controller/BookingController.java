package com.example.pinkrapido.controller;

import com.example.pinkrapido.entity.BookingEntity;
import com.example.pinkrapido.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {
    @Autowired
    private BookingService bookingService;
    @PostMapping("/create")
    public BookingEntity createbooking(@RequestBody BookingEntity booking){
        return bookingService.savebooking(booking);
    }
    @GetMapping("/all")
    public List<BookingEntity> getAllbooking(){
        return bookingService.getAllbooking();
    }


}
