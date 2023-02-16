package com.web.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.web.model.Customer;
import com.web.model.Product;

public interface CustomerProductService {

	public Customer saveCustomer(Customer customer);
	public List<Customer> fetchAllCustomers();
	public List<Customer> fetchNameContainingString(@PathVariable String name);
	public List<Product> findByPriceLessThan(double price);
}
