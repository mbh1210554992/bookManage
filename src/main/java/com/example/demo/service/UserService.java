package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUsers(String userId);
    List<User> getAdmins(String userId);
    void deleteUserById(String userId);
    void addUser(User user);
    void addAdmin(User user);
}
