package com.example.springdependencyinjection.controllers;

/*
  This is less desirable than the Constructor injected controller but better than a Property injected controller.
*/

import com.example.springdependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;


    // Autowired needs to be put on the setter method if we want Spring to correctly utilize the setter method
    @Autowired
    @Qualifier("setterGreetingBean")
    public void setGreetingService(GreetingService greetingService) {
        System.out.println("SetterInjectedController.setGreetingService");
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
