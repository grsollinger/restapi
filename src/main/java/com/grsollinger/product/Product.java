package com.grsollinger.product;

import java.math.BigDecimal;
import java.util.UUID;

import com.grsollinger.core.AbstractEntity;

public class Product extends AbstractEntity {
	
	private UUID id;
	private BigDecimal price;
	private String description;
	
	public Product(UUID id, BigDecimal price, String description) {
		this.id = id;
		this.price = price;
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	public BigDecimal getPrice() {
		return price;
	}

}
