package comm.exam.controller;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import comm.exam.factory.MyConnectionFactory;
import comm.exam.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	private MyConnectionFactory factory=null;
	private Connection connection=null;
	private PreparedStatement pStatement=null;
	private Statement statement=null;
	private ResultSet resultSet=null;
	
	@Override
	public void addEmployee(String name,String email,String password,String country) {
		// TODO Auto-generated method stub
		List<Employee>list=new ArrayList<Employee>();
		list.add(new Employee(name,email,password,country));
		
		try {
			Connection conn=MyConnectionFactory.getMySqlConnectionForHR();
			pStatement=conn.prepareStatement("insert into employee(name,email,password,country) values(?,?,?,?)");
			//pStatement.setInt(, employee.getId());
			pStatement.setString(1, name);
			pStatement.setString(2, email);
			pStatement.setString(3, password);
			pStatement.setString(4, country);
			pStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("duplicate id");
			e.printStackTrace();
		} 
	}
	
	public void deleteEmployee(String email) throws SQLException {
		Connection connection=MyConnectionFactory.getMySqlConnectionForHR();
		System.out.println(email);
		pStatement=connection.prepareStatement("delete from employee where email='"+email+"'");
		pStatement.executeUpdate();
	}
	
	public ArrayList<Employee> editEmployee(String email)
	{
		ArrayList<Employee>list=new ArrayList<Employee>();
		try {
			Connection conn=MyConnectionFactory.getMySqlConnectionForHR();
			Statement s=conn.createStatement();
			ResultSet rs=s.executeQuery("select name,email,password,country from employee where email='"+email+"'"); 
		
			while(rs.next())  
			{
				list.add(new Employee(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			}
		} catch (SQLException e) {
			System.out.println("duplicate id");
			e.printStackTrace();
		}
		return list; 
	}
	public void update(String name,String email,String password,String country) throws SQLException {
		Connection connection=MyConnectionFactory.getMySqlConnectionForHR();
		System.out.println(email);
		pStatement=connection.prepareStatement("update employee set name=?,password=?,email=?,country=? where email=?");
		pStatement.setString(1, name);
		pStatement.setString(2, email);
		pStatement.setString(3, password);
		pStatement.setString(4, country);
		pStatement.setString(5, email);
		
		pStatement.executeUpdate();
	}
}
