package com.demo.fullstack_backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Website {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT", unique = true)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String logo;

    @Column(columnDefinition = "TEXT")
    private String primaryColor;

    @Column(columnDefinition = "TEXT")
    private String secondaryColor;

    private boolean active;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
