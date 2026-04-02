package com.example.pinkrapido.repository;

import com.example.pinkrapido.entity.AppEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRepo extends JpaRepository <AppEntity,Long> {
}
