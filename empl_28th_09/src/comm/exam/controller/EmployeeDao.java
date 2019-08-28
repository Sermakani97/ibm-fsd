package comm.exam.controller;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import comm.exam.model.Employee;

public interface EmployeeDao {
	
	public void addEmployee(String name,String email,String password,String country);
	public void deleteEmployee(String email) throws SQLException;
	public ArrayList<Employee> editEmployee(String email);
	public void update(String name,String email,String password,String country) throws SQLException;
	//public List<Employee> getAllEmployees();


}
