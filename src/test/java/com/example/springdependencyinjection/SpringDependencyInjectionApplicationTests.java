package com.example.springdependencyinjection;

import com.example.springdependencyinjection.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringDependencyInjectionApplicationTests {

	@Autowired
	ApplicationContext context;

	@Autowired
	MyController controller;

	@Test
	void testAutowireOfController() {
		assertEquals(controller.sayHello(), "Hello Everyone!");
	}

	@Test
	void testGetControllerFromContext() {
		MyController controller = context.getBean(MyController.class);
		assertEquals(controller.sayHello(), "Hello Everyone!");
	}
	@Test
	void contextLoads() {
	}

}
