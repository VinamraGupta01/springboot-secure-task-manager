package com.springboot_secure_task_manager.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.springboot_secure_task_manager.entity.UserEntity;
import com.springboot_secure_task_manager.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
    
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<UserEntity> registerUser(
            @RequestBody UserEntity user) {

        UserEntity savedUser = userService.registerUser(user);

        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<UserEntity> getUserByEmail(
            @PathVariable String email) {

        UserEntity user = userService.getUserByEmail(email);

        return ResponseEntity.ok(user);
    }
}
