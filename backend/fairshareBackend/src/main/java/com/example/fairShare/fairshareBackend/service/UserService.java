package com.example.fairShare.fairshareBackend.service;

import com.example.fairShare.fairshareBackend.model.Users;
import com.example.fairShare.fairshareBackend.repo.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository userRepo;

    public List<Users> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Users> user= userRepo.findByUsername(username);
        if(user.isPresent())
        {
            var userObj= user.get();
            return User.builder()
                    .username(userObj.getUsername())
                    .password(userObj.getPass())
                    .build();
        }
        else{
            throw new UsernameNotFoundException(username);
        }
    }
}
