package com.example.pinkrapido.controller;

import com.example.pinkrapido.entity.AppEntity;
import com.example.pinkrapido.repository.AppRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class AppController {
    @Autowired
    private AppRepo appRepo;
    @PostMapping("/create")
    public AppEntity createApp(@RequestBody AppEntity app){
        return appRepo.save(app);

    }
    @GetMapping("/all")
    public List<AppEntity> getAllApps(){
        return appRepo.findAll();
    }
}
