package comm.exam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.text.ParseException;




//import model.Employee;

public class Main {
public static void main(String[] args)
{

	Set<Employee> list=new TreeSet<Employee>();
	Set<AgeComparator>lis1=new TreeSet <AgeComparator>();
	Employee employee = null;
	AgeComparator ac=null;
	Scanner scanner=new Scanner(System.in);

    System.out.println("enter number of elements");

    int n=scanner.nextInt();
    for(int i=0;i<n;i++)
	 {
	 System.out.printf("Enter the details of Employee %d ",(i+1));
    System.out.print("EMployee ID: ");
	int id = scanner.nextInt();
	System.out.print("Employee Name: ");
	String name = scanner.next();
	System.out.print("Employee dept ");
	String dept = scanner.next();
	System.out.println("Employee doj");
	String doj=scanner.next();
	 SimpleDateFormat d=new SimpleDateFormat("dd/mm/yyyy");
	 Date dates=null;
	 try
	 {
	  dates=  d.parse(doj);
	 }catch(ParseException p)
	 {
		 p.printStackTrace();
	 }
    
	System.out.print("Employee age ");
	int age = scanner.nextInt();
	System.out.print("Employee salary ");
	int salary = scanner.nextInt();
	list.add(new Employee(id,name,dept,doj,age, salary));
 lis1.add(new AgeComparator(id,name,dept,doj,age,salary));

    }
    System.out.println("1.sort the employee by salary");
    System.out.println("2.sort the employee by age and doj");
    int choice=scanner.nextInt();
    switch(choice)
    {
    case 1:
    	//Collection.sort(list);
    	for(Employee e:list)
    {
    	System.out.println("Employee ID Name Department Date Of Joining Age Salary");
    	System.out.println(e);
    	break;
    }
    case 2:
    	//Collection.sort(lis1);
    	for(AgeComparator a:lis1)
	 {
		 System.out.println("Employee ID Name Department Date Of Joining Age Salary");
		 System.out.println(a);
	 }
    	break;
    }
    
    /*Collections.sort(list,new AgeComparator());
	for(int i=0;i<list.size();i++)
		System.out.println(list.get(i));
	
    System.out.println(employee);
   

   	
}

private static Object get(int i) {
	// TODO Auto-generated method stub
	return null;
}*/
}}
