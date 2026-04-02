package com.example.OrderingProcess.repository;
import com.example.OrderingProcess.entity.OrderplacedEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface orderrepo extends
        JpaRepository<OrderplacedEntity,String> {
}
