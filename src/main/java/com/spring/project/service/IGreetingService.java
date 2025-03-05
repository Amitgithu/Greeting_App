package com.spring.project.service;

import com.spring.project.dto.GreetingDTO;
import com.spring.project.dto.UserDTO;


public interface IGreetingService {
    GreetingDTO addGreeting(UserDTO user);
}
