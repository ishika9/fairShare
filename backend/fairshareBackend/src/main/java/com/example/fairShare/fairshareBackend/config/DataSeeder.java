package com.example.fairShare.fairshareBackend.config;

import com.example.fairShare.fairshareBackend.model.User;
import com.example.fairShare.fairshareBackend.repo.ExpenseRepository;
import com.example.fairShare.fairshareBackend.repo.GroupRepository;
import com.example.fairShare.fairshareBackend.repo.UserRepository;

public class DataSeeder {
    private final UserRepository userRepo;
    private final GroupRepository groupRepo;
    private final ExpenseRepository expenseRepo;

    public DataSeeder(UserRepository userRepo, GroupRepository groupRepo, ExpenseRepository expenseRepo) {
        this.userRepo = userRepo;
        this.groupRepo = groupRepo;
        this.expenseRepo = expenseRepo;
    }

    public void run(String... args){
        if(userRepo.count() == 0){
            User u1 = new User("U00000", "bob", "builder", "bob", "7182313123", true);
        }
    }
}
