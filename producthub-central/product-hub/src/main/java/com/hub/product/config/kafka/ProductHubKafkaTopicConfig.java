package com.hub.product.config.kafka;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class ProductHubKafkaTopicConfig {
	private String kafkaHostAddress;

	private int kafkaPort;

	private String kafkaCompleteAddress;

	@PostConstruct
	private void init() {
		StringBuilder sb = new StringBuilder();
		sb.append(kafkaHostAddress);
		sb.append(":");
		sb.append(kafkaPort);

		kafkaCompleteAddress = sb.toString();
		log.trace("Created complete address for kafka : ", kafkaCompleteAddress);
	}

	@Bean
	public KafkaAdmin kafkaAdmin() {
		Map<String, Object> configs = new HashMap<>();
		configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaCompleteAddress);
		return new KafkaAdmin(configs);
	}


	@Bean
	public NewTopic topic1() {
		return new NewTopic("baeldung", 1, (short) 1);
	}
}
