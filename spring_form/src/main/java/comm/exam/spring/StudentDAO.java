package comm.exam.spring;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class StudentDAO {
	
	
	private DataSource dataSource;
	
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	/*
	 * public void createConnection() { try { Connection
	 * connection=dataSource.getConnection();
	 * System.out.println(connection.toString()); } catch (SQLException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } }
	 */
	public void createEmployee(Student student)
	{
		try {
			Connection connection=dataSource.getConnection();
			PreparedStatement pst=connection.prepareStatement("insert into student(Firstname,LastName,Country,FavoriteLanguage,CountryOptions,OperatingSystems) values(?,?,?,?,?,?)");
			pst.setString(1, student.getFirstName());
			pst.setString(2, student.getLastName());
		
			pst.setString(3, student.getCountry());
			pst.setString(4, student.getFavoriteLanguage());
		//	pst.setString(5, student.getCountryOptions());
			//pst.setString(6, student.getOperatingSystems());
			pst.executeUpdate();
			System.out.println("inserted..!");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
//	public void deleteEmployee(Employee employee)
//	{
//		try {
//			Connection conn=datasource.getConnection();
//		}
//	}
//	
	

}