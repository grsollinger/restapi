package com.grsollinger.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import com.grsollinger.core.AbstractEntity;
import com.grsollinger.product.Product;

public class Order extends AbstractEntity {

	private BigDecimal price;
	private List<OrderItem> items;
	
	public Order(UUID id, Product product) {
		this.items = new ArrayList<>(Arrays.asList(new OrderItem(product)));
	}
	
}
