package com.example.demo.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="patient")
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
	@Column(name = "name")

private String name;
	@Column(name = "diseases")

private String diseases;

public Patient() {
	super();
	// TODO Auto-generated constructor stub
}
public Patient(String name, String diseases) {
	super();
	this.name = name;
	this.diseases = diseases;
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
public String getDiseases() {
	return diseases;
}
public void setDiseases(String diseases) {
	this.diseases = diseases;
}

}
