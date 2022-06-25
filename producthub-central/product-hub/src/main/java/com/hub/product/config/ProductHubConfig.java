package com.hub.product.config;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yuvraj1.sharma
 *
 */

@Configuration
@Slf4j
public class ProductHubConfig {

	@PostConstruct
	private void init() {
		log.trace("Booting up the config for product hub");
	}

}
