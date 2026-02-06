package com.demo.fullstack_backend.dto;

import lombok.Data;

@Data
public class UserDto {
    private long id;
    private String username;
    private String name;
    private String email;
    private String password;
    private String mobileNumber;
    private String role;
    private String phone;
    private String address;
    private String gender;
    private String dob;
    private String image;
    private String status;
}
