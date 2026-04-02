package com.example.pinkrapido.service;
import com.example.pinkrapido.entity.UserEntity;
import com.example.pinkrapido.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userrepo;
    public UserEntity saveUser(UserEntity user){
        return userrepo.save(user);
    }
    public List<UserEntity> getAllUser()
    {
        return userrepo.findAll();
    }
}




