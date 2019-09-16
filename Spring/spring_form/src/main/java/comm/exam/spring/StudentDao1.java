package comm.exam.spring;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao1 {
	
	
	//private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

		
	public void createEmployee(Student student)
	{
		String query="insert into student(Firstname,LastName,Country,FavoriteLanguage,CountryOptions,OperatingSystems) values(?,?,?,?,?,?)";
		Object obj[]= {student.getFirstName(),student.getLastName(),student.getCountry(),student.getFavoriteLanguage(),student.getCountryOptions(),student.getOperatingSystems()};
		jdbcTemplate.update(query,obj);
		System.out.println("done");
	}
	
	
	
	
	
	
		
	

}