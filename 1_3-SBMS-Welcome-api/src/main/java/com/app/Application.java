package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient  // Enables Eureka Client
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
