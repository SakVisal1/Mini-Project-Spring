package com.istad.miniprojectspring.service;

import com.istad.miniprojectspring.model.AllUsers;

import java.util.List;

public interface AllUserService {
    List<AllUsers> getAllUser();
    AllUsers getAllUserByID(int id);
}
