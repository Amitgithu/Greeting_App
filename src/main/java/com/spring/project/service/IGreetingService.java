package com.spring.project.service;

import com.spring.project.dto.GreetingDTO;
import com.spring.project.dto.UserDTO;
import java.util.List;


public interface IGreetingService {
    GreetingDTO addGreeting(UserDTO user);
    GreetingDTO getGreetingById(long id);
    List<GreetingDTO> getAllGreetings();
    GreetingDTO editGreeting(long id, UserDTO user);
}
