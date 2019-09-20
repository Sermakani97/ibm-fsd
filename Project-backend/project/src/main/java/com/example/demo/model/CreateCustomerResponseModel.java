package com.example.demo.model;

public class CreateCustomerResponseModel {

	private String name;
	private String email;
	private String customerId;
	
	public CreateCustomerResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreateCustomerResponseModel(String name, String email,String customerId) {
		super();
		
		this.name = name;
		this.email = email;
		this.customerId=customerId;
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
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
}
