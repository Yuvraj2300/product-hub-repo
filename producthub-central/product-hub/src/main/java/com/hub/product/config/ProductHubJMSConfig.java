package com.hub.product.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductHubJMSConfig {
	//	@Value("${provider.amqp.host}")
	private String amqpHost;

	//	@Value("${provider.amqp.port}")
	private String amqpPort;

	//	@Value("${provider.amqp.username}")
	private String amqpUserName;

	//	@Value("${provider.amqp.password}")
	private String amqpPassword;


	//Create Connection Factory

}
