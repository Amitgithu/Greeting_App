package com.spring.project.controller;

import com.spring.project.dto.GreetingDTO;
import com.spring.project.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping
    public GreetingDTO getGreeting() {
        return new GreetingDTO("Hello, World!");
    }

    @PostMapping
    public GreetingDTO createGreeting(@RequestBody GreetingDTO greeting) {
        return new GreetingDTO("Created: " + greeting.getMessage());
    }

    @PutMapping
    public GreetingDTO updateGreeting(@RequestBody GreetingDTO greeting) {
        return new GreetingDTO("Updated: " + greeting.getMessage());
    }

    @DeleteMapping
    public GreetingDTO deleteGreeting() {
        return new GreetingDTO("Deleted");
    }

    @GetMapping("/simple")
    public GreetingDTO getSimpleGreeting() {
        return new GreetingDTO(greetingService.getSimpleGreet());
    }
}