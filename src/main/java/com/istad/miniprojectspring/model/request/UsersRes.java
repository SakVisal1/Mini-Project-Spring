package com.istad.miniprojectspring.model.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsersRes {
    @NotEmpty(message ="id cannot be empty " )
    private String idUser;
    @NotEmpty(message = "Username cannot be empty" )
    private String username;
    @NotEmpty(message = "description cannot be empty")
    private String description;
    private String imgpf;
   private MultipartFile file;
}
