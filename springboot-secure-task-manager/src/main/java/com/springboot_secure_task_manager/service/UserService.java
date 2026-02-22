package com.springboot_secure_task_manager.service;
import com.springboot_secure_task_manager.entity.UserEntity;

public interface UserService {

     UserEntity registerUser(UserEntity user);

    UserEntity getUserByEmail(String email);

    UserEntity login(String email, String password);
    
}
