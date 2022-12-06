package com.grsollinger.customer.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.grsollinger.customer.Customer;
import com.grsollinger.customer.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(path = "/all", produces = "application/json", method = RequestMethod.GET)
	@ResponseBody
	public String getList() {
		List<Customer> lista = this.customerService.getAll();
		String json = "";
		for (Customer c: lista) {
			json = "\"customer\": {" + c.toString() + "}";
		}
		return json;
	}
}
