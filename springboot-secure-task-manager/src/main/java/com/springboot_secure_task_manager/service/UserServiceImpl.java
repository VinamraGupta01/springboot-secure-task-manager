package com.springboot_secure_task_manager.service;

import com.springboot_secure_task_manager.entity.UserEntity;
import com.springboot_secure_task_manager.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(
            UserRepository userRepository,
            BCryptPasswordEncoder passwordEncoder
    ) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserEntity registerUser(UserEntity user) {

        boolean exists = userRepository.findByEmail(user.getEmail()).isPresent();
        if (exists) {
            throw new IllegalStateException("Email already taken");
        }

        user.setPassword(
                passwordEncoder.encode(user.getPassword())
        );

        return userRepository.save(user);
    }

    @Override
    public UserEntity login(String email, String password) {

        UserEntity user = userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new IllegalStateException("Invalid email or password")
                );

        boolean passwordMatches = passwordEncoder.matches(
                password,
                user.getPassword()
        );

        if (!passwordMatches) {
            throw new IllegalStateException("Invalid email or password");
        }

        return user;
    }

    @Override
    public UserEntity getUserByEmail(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new IllegalStateException("User not found")
                );
    }
}
