package com.web.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {
	
	public List<Customer> findByCustomerNameContaining(String name);
}
