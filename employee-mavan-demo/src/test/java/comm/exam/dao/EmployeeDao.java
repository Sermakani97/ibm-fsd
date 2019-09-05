package comm.exam.dao;
import java.util.List;

import com.ibm.fsd.employee_mavan_demo.Employee;

public interface EmployeeDao {
	
	public void createEmployee(String name,String email,String password,String country);
	public void deleteEmployee(String name,String email,String password,String country);
	//public void update(String name,String email,String password,String country);
	//public Employee getEmployeeById(int id);

}
