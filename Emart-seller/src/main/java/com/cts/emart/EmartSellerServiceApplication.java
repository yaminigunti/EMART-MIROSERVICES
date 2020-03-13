package com.cts.emart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmartSellerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmartSellerServiceApplication.class, args);
	}

}
