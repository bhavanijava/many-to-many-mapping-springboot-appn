package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.Customer;
import com.web.model.Product;
import com.web.service.CustomerProductService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerProductService service;
	
	@PostMapping("/save")
	public Customer saveCustomer(@RequestBody Customer customer)
	{
		return service.saveCustomer(customer);
	}
	
	@GetMapping("/fetchAll")
	public List<Customer> fetchAllCuStomer()
	{
		return service.fetchAllCustomers();
	}
	
	@GetMapping("/fetchNameContaining/{name}")
	public List<Customer> findByCustomerNameContaining(@PathVariable String name)
	{
		return service.fetchNameContainingString(name);
	}
	
	@GetMapping("/fetchProductPrice/{price}")
	public List<Product> findByPriceLessThan(@PathVariable double price)
	{
		return service.findByPriceLessThan(price);
	}
}
