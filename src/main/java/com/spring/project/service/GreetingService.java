package com.spring.project.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getSimpleGreet() {
        return "Hello World!";
    }
}
