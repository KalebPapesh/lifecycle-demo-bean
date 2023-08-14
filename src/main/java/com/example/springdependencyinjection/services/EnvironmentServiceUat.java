package com.example.springdependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("environmentService")
public class EnvironmentServiceUat implements EnvironmentService {
    @Override
    public String getEnv() {
        return "UAT";
    }
}
