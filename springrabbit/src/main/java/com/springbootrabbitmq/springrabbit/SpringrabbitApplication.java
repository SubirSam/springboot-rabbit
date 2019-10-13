package com.springbootrabbitmq.springrabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.springbootrabbitmq")
public class SpringrabbitApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringrabbitApplication.class, args);
	}

}
