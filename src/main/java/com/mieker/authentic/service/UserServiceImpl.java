package com.mieker.authentic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mieker.authentic.model.User;
import com.mieker.authentic.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    @Override
    public User createUser(User user) {
        userRepository.addUser(user);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getUsers();
    }

}
