package comm.exam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//import factory.MyConnectionFactory;
import com.ibm.fsd.employee_mavan_demo.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	//private MyConnectionFactory factory=null;
	private Connection connection=null;
	private PreparedStatement pStatement=null;
	private Statement statement=null;
	private ResultSet resultSet=null;
	

	public EmployeeDaoImpl() throws SQLException {
		super();
		//factory=MyConnectionFactory.createObject();
		//connection=factory.getConnection();
	}

	

		@Override
//	public Employee getEmployeeById(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}



	public void createEmployee(String name,String email,String password,String country) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();

// create session
Session session = factory.openSession();

	
		try {			
			// create a student object
			System.out.println("Creating new student object...");
			Employee tempEmployee = new Employee("arun", "arun@gg.com","sk","India");
			
			// start a transaction
			session.beginTransaction();
			
			// save the student object
			System.out.println("Saving the student...");
			session.save(tempEmployee);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
		//@Override
	//public void deleteEmployee(Employee employee)
	//{
	
	//}	
	}
		@Override
	public void deleteEmployee(String name,String email,String password,String country) {
		// TODO Auto-generated method stub
		
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();

// create session
Session session = factory.openSession();

try {								
int studentId = 11;

// now get a new session and start transaction
session = factory.openSession();
session.beginTransaction();

// retrieve student based on the id: primary key
System.out.println("\nGetting student with id: " + studentId);

Employee myStudent = session.get(Employee.class, studentId);

// delete the student
System.out.println("Deleting student: " + myStudent);
session.delete(myStudent);

/*
* // delete student id=2 System.out.println("Deleting student id=2");
* 
* session.createQuery("delete from Student where id=2").executeUpdate();
*/
// commit the transaction
session.getTransaction().commit();

System.out.println("Done!");
}
finally {
factory.close();
}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
