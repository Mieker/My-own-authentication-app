package com.mieker.authentic.service;

import java.util.List;

import com.mieker.authentic.model.AppUser;

public interface UserService {

    AppUser createUser(AppUser user);
    List<AppUser> getAllUsers();
    AppUser findUserByLogin(String login);
}
