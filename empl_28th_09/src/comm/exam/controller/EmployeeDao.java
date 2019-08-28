package comm.exam.controller;
import java.util.List;

import comm.exam.model.Employee;

public interface EmployeeDao {
	
	public void addEmployee(String name,String email,String password,String country);
	//public void deleteEmployee(Employee employee);
	//public List<Employee> getAllEmployees();


}
