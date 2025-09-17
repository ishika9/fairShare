package com.example.fairShare.fairshareBackend.config;

import com.example.fairShare.fairshareBackend.model.User;
import com.example.fairShare.fairshareBackend.repo.ExpenseRepository;
import com.example.fairShare.fairshareBackend.repo.GroupRepository;
import com.example.fairShare.fairshareBackend.repo.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements CommandLineRunner {

    private final UserRepository userRepo;
    private final GroupRepository groupRepo;
    private final ExpenseRepository expenseRepo;

    public DataSeeder(UserRepository userRepo, GroupRepository groupRepo, ExpenseRepository expenseRepo) {
        this.userRepo = userRepo;
        this.groupRepo = groupRepo;
        this.expenseRepo = expenseRepo;
    }

    @Override
    public void run(String... args) {
        if (userRepo.count() == 0) {
            User u1 = new User(null, "bob", "builder", "bob", "7182313123", true);
            userRepo.save(u1);
        }
    }
}
