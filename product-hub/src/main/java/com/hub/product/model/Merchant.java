package com.hub.product.model;

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
public class Merchant {
	private String id;
	private String name;
	private String apiUrl;
}
