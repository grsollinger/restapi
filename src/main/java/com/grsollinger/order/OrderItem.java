package com.grsollinger.order;

import java.math.BigDecimal;
import java.util.UUID;

import com.grsollinger.product.Product;

public class OrderItem {

	private UUID productId;
	private BigDecimal price;

	public OrderItem(Product product) {
		this.productId = product.getId();
		this.price = product.getPrice();
	}

	public BigDecimal getPrice() {
		return price;
	}

	public UUID getProductId() {
		return productId;
	}

}
