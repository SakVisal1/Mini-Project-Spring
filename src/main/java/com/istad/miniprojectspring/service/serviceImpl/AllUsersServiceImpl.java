package com.istad.miniprojectspring.service.serviceImpl;

import com.istad.miniprojectspring.model.AllUsers;
import com.istad.miniprojectspring.repository.AllUsersRepo;
import com.istad.miniprojectspring.service.AllUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AllUsersServiceImpl implements AllUserService {
    AllUsersRepo allUsersRepo;
    @Autowired
    AllUsersServiceImpl(AllUsersRepo allUsersRepo){
        this.allUsersRepo = allUsersRepo;
    }
    @Override
    public List<AllUsers> getAllUser() {
        return allUsersRepo.getAllUsersList();
    }

    @Override
    public AllUsers getAllUserByID(int id) {
        return allUsersRepo.getAllUserByID(id);
    }
}
