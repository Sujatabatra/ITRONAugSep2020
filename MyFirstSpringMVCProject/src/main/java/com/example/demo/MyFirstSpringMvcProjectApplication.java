package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.sujata.controller")
public class MyFirstSpringMvcProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpringMvcProjectApplication.class, args);
	}

}
