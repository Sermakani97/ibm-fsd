package com.example.demo.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String name;
private String email;
private String password;
private String customerId;

@ManyToMany
@JoinTable(name = "customer_product", joinColumns = @JoinColumn(name = "customer_id"),inverseJoinColumns = @JoinColumn(name = "product_id"))
private List<Product> products = new ArrayList<>();


public Customer() {
	super();
	// TODO Auto-generated constructor stub
}


public List<Product> getProducts() {
	return products;
}


public Customer(String name, String email, String password, String customerId, List<Product> products) {
	super();
	this.name = name;
	this.email = email;
	this.password = password;
	this.customerId = customerId;
	this.products = products;
}

public Customer(String name, String email, String password, List<Product> products) {
	super();
	this.name = name;
	this.email = email;
	this.password = password;
	this.products = products;
}

public void setProducts(List<Product> products) {
	this.products = products;
}

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}

}
