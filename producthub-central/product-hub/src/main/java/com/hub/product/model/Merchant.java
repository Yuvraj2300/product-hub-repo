package com.hub.product.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yuvraj1.sharma
 *
 * @implNote Represents a merchant that sells a product thru this hub A merchant
 *           can get request from the product hub by receiving a call on the
 *           endpoint provided by the merchant
 *
 *
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Merchant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String apiUrl;
}
