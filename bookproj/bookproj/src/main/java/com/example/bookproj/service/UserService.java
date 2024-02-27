package com.example.bookproj.service;

import com.example.bookproj.model.User;
import com.example.bookproj.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUser(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}

