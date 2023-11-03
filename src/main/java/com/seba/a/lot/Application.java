package com.seba.a.lot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("hello there!");
		SpringApplication.run(Application.class, args);
	}
}