package com.demo.fullstack_backend.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class WebsiteDto {
    private Long id;
    private String name;
    private String logo;
    private String primaryColor;
    private String secondaryColor;
    private boolean active;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
