package com.example.gradledemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GradledemoApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Springboot project");
		SpringApplication.run(GradledemoApplication.class, args);
	}

}
