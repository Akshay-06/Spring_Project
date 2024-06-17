package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
		ApplicationContext  context = SpringApplication.run(SpringProjectApplication.class, args);
		
		
		// Usually we create the object by saying new Class() and we need to maintain that class
		// But in Spring, we inject the object of that class,  this concept is known as Dependency Injection
		Alien alien = context.getBean(Alien.class);
		alien.code();
	}

}
