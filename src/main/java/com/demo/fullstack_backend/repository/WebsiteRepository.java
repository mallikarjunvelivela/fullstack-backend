package com.demo.fullstack_backend.repository;

import com.demo.fullstack_backend.model.Website;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebsiteRepository extends JpaRepository<Website, Long> {
}
