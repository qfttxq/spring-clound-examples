package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableEurekaServer
public class SpringCloundEurekaApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloundEurekaApplication.class, args);
	}
}
