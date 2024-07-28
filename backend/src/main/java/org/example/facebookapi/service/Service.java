package org.example.facebookapi.service;

import org.example.facebookapi.model.User;
import org.example.facebookapi.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    Repository repo;

    public void addUser(User user) {
        repo.save(user);
    }

    public List<User> getUsers() {
        return repo.findAll();
    }
}
