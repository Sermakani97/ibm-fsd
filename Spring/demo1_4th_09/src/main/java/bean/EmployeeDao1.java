package bean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao1 {
	
	
	//private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void createEmployee(Employee employee)
	{
		String query="insert into employee(id,Firstname,LastName,Email) values(?,?,?,?)";
		Object obj[]= {employee.getId(),employee.getFirstname(),employee.getLastName(),employee.getEmail()};
		jdbcTemplate.update(query,obj);
		System.out.println("done");
	}
	
	
	
	
	
	
		
	

}