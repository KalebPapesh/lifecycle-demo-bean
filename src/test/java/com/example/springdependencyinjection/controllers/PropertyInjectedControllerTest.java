package com.example.springdependencyinjection.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PropertyInjectedControllerTest {
    @Autowired
    PropertyInjectedController propertyInjectedController;

    @Test
    void testSayHello() {
        System.out.println(propertyInjectedController.sayHello());
        assertEquals("Friends don't let friends use property injection!!!", propertyInjectedController.sayHello());
    }
}
