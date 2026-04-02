package com.example.pinkrapido.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class BookingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private String Payment_mode;
    private Float Amount;
    @ManyToOne
    @JoinColumn(name="User_name")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name="Servicer_name")
    private AppEntity App;




}
