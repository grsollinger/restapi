package com.grsollinger.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grsollinger.customer.Customer;
import com.grsollinger.customer.dao.CustomerDAO;

@Service(value = "customerService")
public class CustomerService {
	
	@Autowired
	private CustomerDAO dao;
	
	public List<Customer> getAll() {
		return this.dao.getAll();
	}

}
