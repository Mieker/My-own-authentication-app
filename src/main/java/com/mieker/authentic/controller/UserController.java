package com.mieker.authentic.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mieker.authentic.model.AppUser;
import com.mieker.authentic.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;
    
    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping("/hello")
    public String sayHello() {
        return "hello world";
    }
    
    @PostMapping("/user")
    public AppUser createUser(@RequestBody AppUser user) {
        return userService.createUser(user);
    }
    
    @GetMapping("/user")
    public List<AppUser> getAllUsers() {
        return userService.getAllUsers();
    }
}
