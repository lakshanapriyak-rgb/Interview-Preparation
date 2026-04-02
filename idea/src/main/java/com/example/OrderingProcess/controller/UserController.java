package com.example.OrderingProcess.controller;

import com.example.OrderingProcess.entity.UserEntity;
import com.example.OrderingProcess.repository.userrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private userrepo userRepo;

    @PostMapping("/add")
    public UserEntity addUser(@RequestBody UserEntity user){
        return userRepo.save(user);
    }

    @GetMapping("/all")
    public List<UserEntity> getAllUsers(){
        return userRepo.findAll();
    }
}