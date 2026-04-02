package com.example.OrderingProcess.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity

public class PaymentEntity {
    @Id
    private long order_id;
    private long payment_id;
    private String payment_mode;
    @OneToOne
    @JoinColumn(name="order_id")
    private OrderplacedEntity order;


}

