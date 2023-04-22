package com.istad.miniprojectspring.controller;

import com.istad.miniprojectspring.model.User;
import com.istad.miniprojectspring.model.request.UsersRes;
import com.istad.miniprojectspring.service.AllUserService;
import com.istad.miniprojectspring.service.FileUploadService;
import com.istad.miniprojectspring.service.UsersService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FragmentsController {
    UsersService usersService;
    AllUserService allUserService;
    FileUploadService fileUploadService;
    @Autowired
    FragmentsController(UsersService usersService , AllUserService allUserService ,FileUploadService fileUploadService){
        this.usersService = usersService;
        this.allUserService= allUserService;
        this.fileUploadService = fileUploadService;
    }
    @GetMapping("/users")
   public String index(Model model){
        model.addAttribute("allusers",usersService.getAllUsers());
        return"index";
    }
    @GetMapping("/allUsers")
    public String allUser(Model model){
        model.addAttribute("allUser",allUserService.getAllUser());
        return"allUsers";
    }
    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("addNew",new UsersRes());
        return"Form";
    }
    @PostMapping("/handleAddNew")
    public String handleAddNew(@ModelAttribute @Valid UsersRes user, BindingResult bindingResult,Model model) {
        if (bindingResult.hasErrors()) {
            System.out.println("Error has Happened");
            model.addAttribute("addNew", new UsersRes());
            return "/form";
        }
        User newUsers = new User();
        try {
            String filenames = "http://localhost:8080/images/" + fileUploadService.uploadFile(user.getFile());
            System.out.println("Files name : " + filenames);
            newUsers.setImgpost(filenames);
        } catch (Exception ex) {
            newUsers.setImgpost("https://react.semantic-ui.com/images/avatar/large/veronika.jpg");
            System.out.println("ERROR : " + ex.getMessage());
        }

            newUsers.setIdUser(user.getIdUser());
            newUsers.setUsername(user.getUsername());
            newUsers.setDescription(user.getDescription());
            newUsers.setImgpf(user.getImgpf());
//        newUsers.setImgpost(user.getFile());
            usersService.addNewPost(newUsers);
            return "redirect:/users";
        }

    }