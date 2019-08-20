package comm.exam.p1;
import java.util.List;

import model.Employee;

public interface EmployeeDao {
	
	public void createEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int id);

}
