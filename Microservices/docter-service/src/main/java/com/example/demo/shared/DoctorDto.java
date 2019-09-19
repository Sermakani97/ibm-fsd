package com.example.demo.shared;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DoctorDto {
private String name;
private String specialist;

public DoctorDto() {
	super();
	// TODO Auto-generated constructor stub
}
public DoctorDto(String name, String specialist) {
	super();
	this.name = name;
	this.specialist = specialist;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSpecialist() {
	return specialist;
}
public void setSpecialist(String specialist) {
	this.specialist = specialist;
}
}
