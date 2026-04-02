package com.example.OrderingProcess.repository;
import com.example.OrderingProcess.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userrepo extends
    JpaRepository<UserEntity,String>{
}
