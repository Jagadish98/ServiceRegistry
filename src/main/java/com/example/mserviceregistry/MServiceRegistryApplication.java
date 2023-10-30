package com.example.mserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MServiceRegistryApplication.class, args);
	}

}
