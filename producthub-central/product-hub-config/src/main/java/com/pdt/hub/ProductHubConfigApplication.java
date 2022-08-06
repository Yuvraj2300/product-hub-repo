package com.pdt.hub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ProductHubConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductHubConfigApplication.class, args);
	}

}
