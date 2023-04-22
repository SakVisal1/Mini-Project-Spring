package com.istad.miniprojectspring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String idUser;
    private String username;
    private String description;
    private String imgpf;
    private String imgpost;


}
