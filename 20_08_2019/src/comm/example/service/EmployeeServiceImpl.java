package comm.example.service;
import java.sql.SQLException;
import java.util.List;

//import comm.exam.p1.EmployeeDao;
import comm.exam.p1.EmployeeDaoImpl;
import model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDaoImpl dao = null;

	public EmployeeServiceImpl() throws SQLException {
		super();
		dao = new EmployeeDaoImpl();
	}

	@Override
	public void createEmployee(Employee employee) {

		dao.createEmployee(employee);
	}
	public void deleteEmployee(Employee employee) {

		dao.createEmployee(employee);
	}


	@Override
	public List<Employee> getAllEmployees() {

		return dao.getAllEmployees();
	}

	@Override
	public Employee getEmployeeById(int id) {

		return null;
	}

}

