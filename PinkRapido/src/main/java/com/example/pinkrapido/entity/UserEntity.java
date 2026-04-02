package com.example.pinkrapido.entity;
import java.util.List;
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

public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private String User_name;
    private String Ph_no;
    private String Location;
    private int User_id;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<BookingEntity> Booking;
}
