package com.example.demo.entity;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String description;
//	@OneToMany(mappedBy="category" ,cascade = CascadeType.ALL)
//	private Set<Product> products;
//	
//	public Set<Product> getProducts() {
//		return products;
//	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
//	public void setProducts(Set<Product> products) {
//		this.products = products;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Category(String name, String description, Set<Product> products) {
		super();
		this.name = name;
		this.description = description;
		//this.products = products;
	}
	public Category(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}