package com.mieker.authentic.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mieker.authentic.model.AppUser;

@Repository
public class UserRepository {

    private List<AppUser> users = new ArrayList<>();

    public List<AppUser> getUsers() {
        return users;
    }

    public void addUser(AppUser user) {
        users.add(user);
    }

    public AppUser findUserByLogin(String login) {
        for (AppUser u : users) {
            if (u.getUserName().equals(login))
                return u;
        }
        return null;
    }
}
