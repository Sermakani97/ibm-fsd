package com.example.springempl13th.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.springempl13th.model.Employee;
import com.example.springempl13th.repository.EmployeeRepository;

@Component
public class DevJpaBootStrap implements ApplicationListener<ContextRefreshedEvent>{
private EmployeeRepository employeeRepository;
	public DevJpaBootStrap(EmployeeRepository employeeRepository) {
	super();
	this.employeeRepository = employeeRepository;
}
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		init();
		
	}
	public void init()
	{
		Employee e=new Employee("serma","kani","ser@gg.com",2000,3000,40000,3000,"manager");
		employeeRepository.save(e);
		
	}

}
