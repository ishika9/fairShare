package com.example.fairShare.fairshareBackend.repo;

import com.example.fairShare.fairshareBackend.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group, String> {
}
