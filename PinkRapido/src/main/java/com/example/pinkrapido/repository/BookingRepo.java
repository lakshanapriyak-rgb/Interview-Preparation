package com.example.pinkrapido.repository;

import com.example.pinkrapido.entity.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepo extends JpaRepository <BookingEntity,Long>{
}
