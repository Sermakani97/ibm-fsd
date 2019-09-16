package bean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class EmployeeDAO {
	
	
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
	public void createEmployee(Employee employee)
	{
		try {
			Connection connection=dataSource.getConnection();
			PreparedStatement pst=connection.prepareStatement("insert into employee(id,Firstname,LastName,Email) values(?,?,?,?)");
			pst.setInt(1, employee.getId());
			pst.setString(2, employee.getFirstname());
			pst.setString(3, employee.getLastName());
			pst.setString(4, employee.getEmail());
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