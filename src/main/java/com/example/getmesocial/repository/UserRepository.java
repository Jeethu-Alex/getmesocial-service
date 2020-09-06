package com.example.getmesocial.repository;

import com.example.getmesocial.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getUser(){
        User user = new User("Jeethu", "USA", 40, "www.linkedin.com/in/alexjeethu");
        return user;
    }
}
