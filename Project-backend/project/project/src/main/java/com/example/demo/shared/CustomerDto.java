package com.example.demo.shared;

public class CustomerDto {

	private String name;
	private String email;
	private String password;
	private String customerId;
	
	
	public CustomerDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerDto(String name, String email, String password,String customerId) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
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
