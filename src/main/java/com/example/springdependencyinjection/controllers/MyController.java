package com.example.springdependencyinjection.controllers;

// A SpringBootApplication will do a scan for any annotated components in the package it's in and below
// Thus requiring that this is in the same package as the application and not outside of it

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello() {
        System.out.println("I'm in the controller!");
        return "Hello Everyone!";
    }
}
