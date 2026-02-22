package com.springboot_secure_task_manager.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot_secure_task_manager.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository <UserEntity, Long> {
    Optional <UserEntity> findByEmail(String email);
}
