package com.example.springdependencyinjection.controllers;

import com.example.springdependencyinjection.services.EnvironmentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {
    private final EnvironmentService environmentService;

    public EnvironmentController(@Qualifier("environmentService") EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvironment() {
        return "You are in " + environmentService.getEnv() + " Environment";
    }
}
