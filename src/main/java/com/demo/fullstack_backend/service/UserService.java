package com.demo.fullstack_backend.service;

import java.util.List;

import com.demo.fullstack_backend.dto.UserDto;
import com.demo.fullstack_backend.payload.LoginResponse;

public interface UserService {
    UserDto saveUser(UserDto userDto);
    List<UserDto> getAllUsers();
    UserDto getUserById(Long id);
    UserDto updateUser(UserDto userDto, Long id);
    String deleteUser(Long id);
    LoginResponse loginUser(String usernameOrEmail, String password);
    String forgotPassword(String emailOrMobile);
    String verifyOtp(String email, String otp);
    String resetPassword(String email, String newPassword);
}
