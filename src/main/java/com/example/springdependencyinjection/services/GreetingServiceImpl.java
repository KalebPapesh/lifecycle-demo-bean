package com.example.springdependencyinjection.services;

import org.springframework.stereotype.Service;

// Tell Spring that this is a spring managed object
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone From Base Service";
    }
}
