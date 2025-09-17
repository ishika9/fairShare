package com.example.fairShare.fairshareBackend.controller;

import com.example.fairShare.fairshareBackend.model.Users;
import com.example.fairShare.fairshareBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Repeatable;
import java.util.List;

@RestController
public class userController {
    @Autowired
    private UserService userSvc;

    @GetMapping("/")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }

    @GetMapping("/getUsers")
    public ResponseEntity<List<Users>> getAllUsers(){
        System.out.println(userSvc.getAllUsers());
        return new ResponseEntity<>(userSvc.getAllUsers(), HttpStatus.OK);
    }
}
