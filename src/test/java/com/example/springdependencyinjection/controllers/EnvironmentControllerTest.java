package com.example.springdependencyinjection.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class EnvironmentControllerTest {

    /*
    GreetingService will only use the default profile when there is no active profile
    however, we're setting dev as the profile but it doesn't know what to do with this, so we have to set EN
    This is just the easiest way to get this unit test working by setting more than 1 active profile
    */
    @ActiveProfiles({"dev", "EN"})
    @SpringBootTest
    public static class DevEnvironmentControllerTest {
        @Autowired
        EnvironmentController controller;

        @Test
        void envTest() {
            System.out.println(controller.getEnvironment());
            assertEquals("You are in dev Environment", controller.getEnvironment());
        }
    }

    @ActiveProfiles({"prod", "EN"})
    @SpringBootTest
    public static class ProdEnvironmentControllerTest {
        @Autowired
        EnvironmentController controller;

        @Test
        void envTest() {
            System.out.println(controller.getEnvironment());
            assertEquals("You are in prod Environment", controller.getEnvironment());
        }
    }

    @ActiveProfiles({"qa", "EN"})
    @SpringBootTest
    public static class QaEnvironmentControllerTest {
        @Autowired
        EnvironmentController controller;

        @Test
        void envTest() {
            System.out.println(controller.getEnvironment());
            assertEquals("You are in QA Environment", controller.getEnvironment());
        }
    }

    @ActiveProfiles({"uat", "EN"})
    @SpringBootTest
    public static class UatEnvironmentControllerTest {
        @Autowired
        EnvironmentController controller;

        @Test
        void envTest() {
            System.out.println(controller.getEnvironment());
            assertEquals("You are in UAT Environment", controller.getEnvironment());
        }
    }
}


