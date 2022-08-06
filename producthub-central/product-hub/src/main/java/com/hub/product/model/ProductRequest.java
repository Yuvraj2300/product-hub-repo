package com.hub.product.model;

import java.util.Set;

import javax.validation.constraints.NotBlank;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductRequest {
	private String id;
	@NotBlank(message = "Please give a search term.")
	private String searchTerm;


	private double minPrice;
	private double maxPrice;

	private Set<Merchant> merchants;
}
