package com.telusko.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
//		System.out.println("Hello World");

//		Alien a1 = new Alien();
//		a1.code();

		Alien obj = context.getBean(Alien.class);
		obj.code();
	}

}
