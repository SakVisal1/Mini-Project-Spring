package com.istad.miniprojectspring.service.serviceImpl;

import com.istad.miniprojectspring.model.User;
import com.istad.miniprojectspring.repository.UsersRepo;
import com.istad.miniprojectspring.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersServiceImpl implements UsersService {
    UsersRepo usersRepo;
    @Autowired
    UsersServiceImpl(){
        usersRepo = new UsersRepo();
    }
    @Override
    public List<User> getAllUsers() {
        return usersRepo.getUserList();
    }

    @Override
    public void addNewPost(User user) {
        usersRepo.addNewUser(user);
    }
}
