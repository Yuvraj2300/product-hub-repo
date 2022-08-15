package com.hub.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ProductHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductHubApplication.class, args);
	}

}
