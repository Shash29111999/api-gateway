package com.apisgateways.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApisGatewaysApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApisGatewaysApplication.class, args);
	}

}
