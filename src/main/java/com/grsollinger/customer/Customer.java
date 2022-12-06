package com.grsollinger.customer;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Customer {
	
	private int id;
	private String nombre;

	public Customer(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
}
