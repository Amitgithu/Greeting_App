package com.spring.project.service;

import com.spring.project.dto.GreetingDTO;
import com.spring.project.dto.UserDTO;
import com.spring.project.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService implements IGreetingService {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private GreetingRepository greetingRepository;

    @Override
    public GreetingDTO addGreeting(UserDTO user) {
        String message = String.format(template, (user.getFirstName() == null && user.getLastName() == null) ? "World" : user.getFirstName() + " " + user.getLastName());
        return greetingRepository.save(new GreetingDTO(counter.incrementAndGet(), message));
    }
}
