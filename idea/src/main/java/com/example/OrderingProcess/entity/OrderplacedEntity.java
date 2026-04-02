package com.example.OrderingProcess.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity

public class OrderplacedEntity {
    @Id
   private long order_id;
   private int unit_of_product;
   private String address;
   @ManyToOne
    @JoinColumn(name="user_id")
    private UserEntity user;
   @ManyToOne
    @JoinColumn(name ="product_id")
    private ProductEntity product;
   @OneToOne(mappedBy = "order",cascade= CascadeType.ALL)
    private PaymentEntity payment;





}
