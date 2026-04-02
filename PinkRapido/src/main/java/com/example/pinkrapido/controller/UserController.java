package com.example.pinkrapido.controller;

import com.example.pinkrapido.entity.UserEntity;
import com.example.pinkrapido.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/create")
    public UserEntity createUser(@RequestBody UserEntity user){
        return userService.saveUser(user);
    }
    @GetMapping("/all")
public List<UserEntity> getAllUsers(){
        return userService.getAllUser();
    }

}
