package com.mieker.authentic.service;

import java.util.List;

import com.mieker.authentic.model.User;

public interface UserService {

    User createUser(User user);
    List<User> getAllUsers();
}
