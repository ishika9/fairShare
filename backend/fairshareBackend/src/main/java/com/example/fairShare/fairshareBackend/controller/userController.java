package com.example.fairShare.fairshareBackend.controller;

import com.example.fairShare.fairshareBackend.model.User;
import com.example.fairShare.fairshareBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class userController {
    @Autowired
    private UserService userSvc;

    @GetMapping("/getUsers")
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userSvc.getAllUsers(), HttpStatus.OK);
    }
}
