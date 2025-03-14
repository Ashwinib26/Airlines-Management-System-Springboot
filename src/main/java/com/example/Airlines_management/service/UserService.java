package com.example.airlinesmanagement.service;

import com.example.airlinesmanagement.entity.User;
import com.example.airlinesmanagement.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
        return userRepository.save(user);
    }
}
