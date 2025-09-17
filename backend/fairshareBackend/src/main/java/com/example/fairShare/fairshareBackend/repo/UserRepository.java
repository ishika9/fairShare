package com.example.fairShare.fairshareBackend.repo;

import com.example.fairShare.fairshareBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
