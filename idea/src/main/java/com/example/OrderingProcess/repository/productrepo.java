package com.example.OrderingProcess.repository;
import com.example.OrderingProcess.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productrepo extends
        JpaRepository<ProductEntity,String> {
}
