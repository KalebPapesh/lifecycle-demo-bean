package com.example.springdependencyinjection;

import com.example.springdependencyinjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {
	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

		MyController controller = context.getBean(MyController.class);
		controller.sayHello();
	}

}
