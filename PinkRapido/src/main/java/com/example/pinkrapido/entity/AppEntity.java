package com.example.pinkrapido.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class AppEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Servicer_name;
    private String Servicer_ph_no;
    private String Servicer_location;
    private String Servicer_bike_no;
    @OneToMany(mappedBy = "App",cascade = CascadeType.ALL)
    private List<BookingEntity> Booking;

}
