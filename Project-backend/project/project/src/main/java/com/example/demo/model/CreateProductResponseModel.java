package com.example.demo.model;

public class CreateProductResponseModel {
	private String name;
	private double price;
	private int qnty;
	private String model;
	public CreateProductResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreateProductResponseModel(String name, double price, int qnty, String model) {
		super();
		this.name = name;
		this.price = price;
		this.qnty = qnty;
		this.model = model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQnty() {
		return qnty;
	}
	public void setQnty(int qnty) {
		this.qnty = qnty;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
