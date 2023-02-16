package com.web.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

	public List<Product> findByPriceLessThan(double price);
}
