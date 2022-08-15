package com.hub.product.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private double price;

	@ManyToOne
	private Merchant merchant;
}
