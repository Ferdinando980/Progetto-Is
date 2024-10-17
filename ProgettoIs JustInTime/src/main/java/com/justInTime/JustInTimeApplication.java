package com.justInTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.justInTime.controller", "com.justInTime.service", "com.justInTime.repository"})
public class JustInTimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JustInTimeApplication.class, args);
	}
}
