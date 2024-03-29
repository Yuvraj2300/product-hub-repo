package com.hub.product.controller;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hub.product.model.ProductRequest;
import com.hub.product.model.ProductResponse;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ProductController {

	/**
	 * @author yuvraj1.sharma
	 * @implNote This endpoint will return a product's details. This product is
	 *           supposed to be having the least price<br>
	 *           The client is expected to hit this url with a json body consisting
	 *           of some query params as per their requirements
	 */
	@PostMapping(path = "/products", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getProduct(@RequestBody @Valid ProductRequest request) {
		return null;
	}

}
