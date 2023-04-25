package com.istad.miniprojectspring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AllUsers {
    private int id;
    private String name ;
    private String profile;
    private String title;
    private String coverProfile;
}
