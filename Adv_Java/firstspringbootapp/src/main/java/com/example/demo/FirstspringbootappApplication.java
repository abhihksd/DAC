package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstspringbootappApplication {

	public static void main(String[] args) {
//		SpringApplication.run(FirstspringbootappApplication.class, args);
		ApplicationContext ctx=SpringApplication.run(FirstspringbootappApplication.class, args);
		Test obj= ctx.getBean(Test.class);
		System.out.println(obj);
	}

}
