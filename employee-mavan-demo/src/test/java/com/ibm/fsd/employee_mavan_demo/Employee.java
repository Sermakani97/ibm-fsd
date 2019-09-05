package com.ibm.fsd.employee_mavan_demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="employee")
@Data

public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String Name;
	@Column(name="password")
	private String Password;
	@Column(name="country")
	private String Country;
	@Column(name="email")
	private String Email;
	public Employee() {
		super();
	}

	public Employee( String name, String email, String password, String country) {
		super();
		this.Name = name;
		this.Email = email;
		this.Password = password;
		this.Country = country;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", Password=" + Password + ", Country=" + Country + ", Email="
				+ Email + "]";
	}


}
