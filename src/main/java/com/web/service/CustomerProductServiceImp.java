package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Customer;
import com.web.model.Product;
import com.web.repo.CustomerRepo;
import com.web.repo.ProductRepo;

@Service
public class CustomerProductServiceImp implements CustomerProductService {
	
	@Autowired
	private CustomerRepo customerRepository;
	
	@Autowired
	private ProductRepo productRepository;
	
	
	
	public CustomerProductServiceImp(CustomerRepo customerRepository, ProductRepo productRepository) {
		super();
		this.customerRepository = customerRepository;
		this.productRepository = productRepository;
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> fetchAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public List<Customer> fetchNameContainingString(String name) {
		return customerRepository.findByCustomerNameContaining(name);
	}

	@Override
	public List<Product> findByPriceLessThan(double price) {
		return productRepository.findByPriceLessThan(price);
	}

}
