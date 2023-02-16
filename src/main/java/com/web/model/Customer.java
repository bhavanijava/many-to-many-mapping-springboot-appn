package com.web.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long customerId;
	private String customerName;
	private String email;
	
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,targetEntity=Product.class)
	@JoinTable(name="customerproducttable",joinColumns= {
			@JoinColumn(name="customer_Id",referencedColumnName="customerId")
	},
	inverseJoinColumns= {
			@JoinColumn(name="product_Id",referencedColumnName="productId")
	})
	private Set<Product> products;

	public Customer() {
		super();
	}

	public Customer(Long customerId, String customerName, String email, Set<Product> products) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.products = products;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	
}
