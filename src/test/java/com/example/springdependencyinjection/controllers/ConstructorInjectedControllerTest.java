package com.example.springdependencyinjection.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConstructorInjectedControllerTest {
    @Autowired
    ConstructorInjectedController controller;

    @Test
    void testSayHello() {
        assertEquals("Hello Everyone From Base Service", controller.sayHello());
    }
}
