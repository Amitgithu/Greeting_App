package com.spring.project.repository;

import com.spring.project.dto.GreetingDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<GreetingDTO, Long> {
}
