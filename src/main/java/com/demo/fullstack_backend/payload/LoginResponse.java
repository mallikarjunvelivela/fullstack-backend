package com.demo.fullstack_backend.payload;

import com.demo.fullstack_backend.dto.UserDto;

public class LoginResponse {
    private String jwt;
    private UserDto user;

    public LoginResponse(String jwt, UserDto user) {
        this.jwt = jwt;
        this.user = user;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }
}
