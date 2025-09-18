package com.example.fairShare.fairshareBackend.repo;

import com.example.fairShare.fairshareBackend.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<Users, UUID> {
//    @Override
    Optional<Users> findByUsername(String username);
}
