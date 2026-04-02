package com.example.OrderingProcess.repository;
import com.example.OrderingProcess.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface paymentrepo extends
        JpaRepository<PaymentEntity,String> {
}
