package com.example.pinkrapido.repository;
import com.example.pinkrapido.entity.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <UserEntity,Long> {
}
