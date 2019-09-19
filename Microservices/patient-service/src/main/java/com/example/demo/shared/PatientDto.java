package com.example.demo.shared;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class PatientDto {
private String name;
private String diseases;

public PatientDto() {
	super();
	// TODO Auto-generated constructor stub
}
public PatientDto(String name, String diseases) {
	super();
	this.name = name;
	this.diseases = diseases;
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
