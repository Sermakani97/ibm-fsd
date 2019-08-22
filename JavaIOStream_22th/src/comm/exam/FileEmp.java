package comm.exam;

import java.io.*;
import java.sql.SQLException;

import comm.example.service.EmployeeService;
import comm.example.service.EmployeeServiceImpl;
import model.Employee;

public class FileEmp {
public static void main(String args[]) throws IOException,SQLException
{
	EmployeeService emp=new EmployeeServiceImpl();
	File ifile=new File("TextFile.txt");
	FileReader in=new FileReader(ifile);
	BufferedReader input=new BufferedReader(in);
	String line=input.readLine();
	while(line!=null)
	{
		String arr[]=line.split(" ");
		int id=Integer.parseInt(arr[0]);
		String firstname=arr[1];
		String lastname=arr[2];
		String email=arr[3];
		emp.createEmployee(new Employee(id,firstname,lastname,email));
		System.out.println(line);
		line = input.readLine();
		System.out.println(id);
		System.out.println(firstname);
		System.out.println(lastname);
		
}
	in.close();
	input.close();
	}
}
