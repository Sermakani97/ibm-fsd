package comm.exam.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import comm.exam.factory.MyConnectionFactory;

public class MyConnectionFactory {

	private static javax.sql.DataSource dataSource=null;
	private static Connection connection=null;
	
	public static Connection getMySqlConnectionForHR()
	{
		try {
			
			
			Context initContext = new InitialContext();
			Object o  = initContext.lookup("java:/comp/env/jdbc/mysql");
			dataSource=(javax.sql.DataSource)o;
			
			 connection= dataSource.getConnection();
			
		} catch (NamingException ne) {
			ne.printStackTrace();
			
		} catch (SQLException se) {
			// TODO Auto-generated catch block
			se.printStackTrace();
		}
		return connection;
	}



	}
