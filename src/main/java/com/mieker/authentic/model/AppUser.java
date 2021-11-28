package com.mieker.authentic.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class AppUser {

    private String userName;

    @JsonProperty(access = Access.WRITE_ONLY)
    private String userPassword;

    public AppUser() {

    }

    public AppUser(String userName, String userPassword) {
        super();
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

}
