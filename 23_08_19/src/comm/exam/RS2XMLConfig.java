package comm.exam;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import factory.MyConnectionFactory;

public class RS2XMLConfig {
private MyConnectionFactory factory;
private Connection connection;
public RS2XMLConfig()throws SQLException{
	super();
	factory=MyConnectionFactory.createObject();
	connection=factory.getConnection();
	}

public ResultSet getAllEmployees(int id)throws SQLException {
	// TODO Auto-generated method stub
	Statement st=connection.createStatement();
	ResultSet rs=st.executeQuery("select id as ID,firstname as FirstName,lastname as LastName,email as Email from employee where id="+id);
			return rs;

	
}
}
