package com.example.OrderingProcess.repository;
import com.example.OrderingProcess.entity.DeliverEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface deliverrepo extends
        JpaRepository<DeliverEntity,String> {
}
