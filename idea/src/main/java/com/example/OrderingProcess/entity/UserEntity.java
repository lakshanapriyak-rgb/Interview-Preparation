package com.example.OrderingProcess.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class UserEntity {
    @Id
    private int user_id;
    private String user_name;
    private Long ph_no;
    private String address;
    @ManyToMany
    @JoinTable(
            name = "user_product",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name ="product")
    )
    private List<ProductEntity> products;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<OrderplacedEntity> orders;
    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    private DeliverEntity delivery;



}
