package com.hub.product.model;

import java.util.Set;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductRequest {
	private String id;
	private String searchTerm;
	private double minPrice;
	private double maxPrice;
	private Set<Merchant> merchants;
}
