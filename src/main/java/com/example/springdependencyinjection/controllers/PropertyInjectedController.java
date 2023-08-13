package com.example.springdependencyinjection.controllers;

/*
  Least desirable way to use dependency injection.

  They can be public or private properties but spring uses reflection to set private properties which is slow
  and makes testing hard. Even IntelliJ knows that this kind of injection is not recommended.
*/

import com.example.springdependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
