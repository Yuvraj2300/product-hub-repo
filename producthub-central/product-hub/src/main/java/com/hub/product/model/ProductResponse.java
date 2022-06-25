package com.hub.product.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductResponse {
	private String id;
	private Product product;
}
