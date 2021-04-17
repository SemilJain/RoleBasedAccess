package com.role.access.model;

import java.util.List;

public class User {
    public String userName;
    public List<Role> role;

    public User(String userName) {
        this.userName = userName;
    }

    public User(String userName, List<Role> role) {
        this.userName = userName;
        this.role = role;
    }


    public List<Role> getRole() {
        return role;
    }

    public void setRole(List<Role> role) {
        this.role = role;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }



}
