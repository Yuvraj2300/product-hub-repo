package com.hub.product.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author yuvraj1.sharma
 *
 * @implNote Represents a product of a merchant that controlled through the
 *           product hub. A product is sold by a merchant at a price
 *
 */

@Data
@Builder
public class Product {
	private String id;
	private String name;
	private String description;
	private Merchant merchant;
	private double price;
}
