package com.demo.fullstack_backend.repository;

import com.demo.fullstack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findByUsernameOrEmail(String username, String email);

    Optional<User> findFirstByEmailOrMobileNumber(String email, String mobileNumber);

    List<User> findByUsername(String username);
    List<User> findByEmail(String email);
    List<User> findByMobileNumber(String mobileNumber);
}
