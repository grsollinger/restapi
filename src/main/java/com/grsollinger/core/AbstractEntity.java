package com.grsollinger.core;

import java.util.UUID;

import org.springframework.data.domain.AbstractAggregateRoot;

public class AbstractEntity extends AbstractAggregateRoot<AbstractEntity>{

	private UUID id;
	
	public UUID getId() {
		return id;
	}
	
}
