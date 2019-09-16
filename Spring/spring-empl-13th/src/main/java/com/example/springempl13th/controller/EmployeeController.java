package com.example.springempl13th.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springempl13th.repository.EmployeeRepository;

@Controller
@RequestMapping("/employees")

public class EmployeeController {
private EmployeeRepository employeeRepository;

public EmployeeController(EmployeeRepository employeeRepository) {
	super();
	this.setEmployeeRepository(employeeRepository);
}

public EmployeeRepository getEmployeeRepository() {
	return employeeRepository;
}

public void setEmployeeRepository(EmployeeRepository employeeRepository) {
	this.employeeRepository = employeeRepository;
}

}
