package com.example.twoweek.repositories;

import com.example.twoweek.model.User;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> users;
    public UserRepository(){
        users = new ArrayList<User>();
    }

    public void addUser(User user){
        users.add(user);

    }

    public List<User> getUsers(){
        return users;
    }

    @PostConstruct
    public void init(){
        User user = new User();
        user.setUsername("David");
        users.add(user);
    }
}
