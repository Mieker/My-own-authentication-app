package com.mieker.authentic.service;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.mieker.authentic.model.User;
import com.mieker.authentic.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    
    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    
    @Override
    public User createUser(User user) {
        
        String hashedPassword = passwordEncoder.encode(user.getUserPassword());
        User userToCreate = new User(user.getUserName(), hashedPassword);
        userRepository.addUser(userToCreate);
        return userToCreate;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getUsers();
    }

}
