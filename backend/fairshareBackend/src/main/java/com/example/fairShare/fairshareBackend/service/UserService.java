package com.example.fairShare.fairshareBackend.service;

import com.example.fairShare.fairshareBackend.model.Users;
import com.example.fairShare.fairshareBackend.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;

    public List<Users> getAllUsers() {
        return userRepo.findAll();
    }
}
