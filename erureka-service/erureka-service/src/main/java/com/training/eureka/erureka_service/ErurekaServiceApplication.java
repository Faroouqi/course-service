package com.training.eureka.erureka_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ErurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErurekaServiceApplication.class, args);
	}

}
