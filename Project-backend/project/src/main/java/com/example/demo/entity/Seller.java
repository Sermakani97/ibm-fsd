package com.example.demo.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Seller {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String name;
private String email;
private String password;
private String location;
//@OneToMany(mappedBy="seller" ,cascade = CascadeType.ALL)
//private Set<Product> products;
//
//public Set<Product> getProducts() {
//	return products;
//}
//public void setProducts(Set<Product> products) {
//	this.products = products;
//}
public Seller()
{
	super();
	// TODO Auto-generated constructor stub
}
public Seller(String name, String email, String password, String location) {
	super();
	this.name = name;
	this.email = email;
	this.password = password;
	this.location = location;
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
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
}
