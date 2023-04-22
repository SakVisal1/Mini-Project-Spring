package com.istad.miniprojectspring.service;

import com.istad.miniprojectspring.model.User;

import java.util.List;

public interface UsersService {
    List<User> getAllUsers();

    void addNewPost(User user);
}
