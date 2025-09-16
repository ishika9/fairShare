package com.example.fairShare.fairshareBackend.service;

import com.example.fairShare.fairshareBackend.model.User;
import com.example.fairShare.fairshareBackend.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;

import java.util.List;
import java.util.Optional;

public class UserService {
    @Autowired
    private UserRepository userRepo;

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
}
