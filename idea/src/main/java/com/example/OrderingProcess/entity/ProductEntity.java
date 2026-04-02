package com.example.OrderingProcess.entity;
import com.example.OrderingProcess.entity.OrderplacedEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class ProductEntity {

    @Id
    private long product_id;

    private String product_name;
    private double prize;
    private int user_id;

    @OneToMany(mappedBy = "product")
    private List<OrderplacedEntity>order;
}