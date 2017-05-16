package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.controller","com.services"})
//@ComponentScan(basePackages = { "com.person","com.controller"}
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
