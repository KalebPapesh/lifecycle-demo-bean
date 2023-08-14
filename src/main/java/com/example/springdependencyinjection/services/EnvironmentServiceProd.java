package com.example.springdependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("environmentService")
public class EnvironmentServiceProd implements EnvironmentService {
    @Override
    public String getEnv() {
        return "prod";
    }
}
