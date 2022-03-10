package com.example.codelabSwagger.service;


import com.example.codelabSwagger.data.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceHashMap implements UserService
{
    private HashMap<String, User> userHashMap = new HashMap<>();


    @Override
    public User create(User user) {
        int id = userHashMap.size()+1;
        userHashMap.put(user.getId(), user);
        return user;
    }

    @Override
    public User findById(String id) {
        return userHashMap.getOrDefault(id, null);
    }

    @Override
    public List<User> all() {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public User update(User user, String userId) {
        return null;
    }
}