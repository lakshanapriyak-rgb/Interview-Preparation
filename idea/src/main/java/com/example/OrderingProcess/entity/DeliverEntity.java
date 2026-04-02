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
@Setter
@Getter
@Entity

public class DeliverEntity {
    @Id
    private String user_name;
    private long ph_no;
    private String address;
    @OneToOne
    @JoinColumn(name="user_name")
    private UserEntity user;
}

