package com.example.springempl13th.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
	private String fname;
	private String lname;
	private String email;
	private int hrpay;
	private int contractHr;
	private double sal;
	private int commission;
	private String empType;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String fname, String lname, String email, int hrpay, int contractHr, double sal, int commission,
			String empType) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.hrpay = hrpay;
		this.contractHr = contractHr;
		this.sal = sal;
		this.commission = commission;
		this.empType = empType;
	}

	public Employee(String fname, String lname, String email, double sal, int commission, String empType) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.sal = sal;
		this.commission = commission;
		this.empType = empType;
	}

	public Employee(String fname, String lname, String email, int hrpay, int contractHr, String empType) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.hrpay = hrpay;
		this.contractHr = contractHr;
		this.empType = empType;
	}

	public Employee(String fname, String lname, String email, String empType) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.empType = empType;
	}

	public Employee(String fname, String lname, String email, int hrpay, int contractHr, int sal, int commission,
			String empType) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.hrpay = hrpay;
		this.contractHr = contractHr;
		this.sal = sal;
		this.commission = commission;
		this.empType = empType;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getHrpay() {
		return hrpay;
	}
	public void setHrpay(int hrpay) {
		this.hrpay = hrpay;
	}
	public int getContractHr() {
		return contractHr;
	}
	public void setContractHr(int contractHr) {
		this.contractHr = contractHr;
	}
	public int getCommission() {
		return commission;
	}
	public void setCommission(int commission) {
		this.commission = commission;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getEmpType() {
		return empType;
	}
	public void setEmpType(String empType) {
		this.empType = empType;
	}
}
