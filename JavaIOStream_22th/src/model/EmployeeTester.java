package model;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import model.Employee;
import comm.example.service.EmployeeService;
import comm.example.service.EmployeeServiceImpl;

public class EmployeeTester {
private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) throws SQLException {
		EmployeeService service=new EmployeeServiceImpl();
		int choice=0;
		do {
			System.out.println("1.create employee.");
			System.out.println("2.display all employee");
			System.out.println("3.delete employee");
			System.out.println("0:exit");
			System.out.print("Your Choice: ");
			choice=scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("EMployee ID: ");
				int id = scanner.nextInt();
				System.out.print("Employee First Name: ");
				String firstName = scanner.next();
				System.out.print("Employee Last Name: ");
				String lastName = scanner.next();
				System.out.print("Employee Email: ");
				String email = scanner.next();
				service.createEmployee(new Employee(id, firstName, lastName, email));
				break;
			case 2:
				List<Employee> list=service.getAllEmployees();
				for(Employee e:list)
				{
					System.out.printf("\n%d\t%s\t%s\t%s",e.getId(),e.getFirstName(),e.getLastName()
							,e.getEmail());
				}
				break;
			case 3:
			case 0:
				System.out.println("Bye!");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice.");
				break;
			}
			
		} while (choice!=0);
		
		

	}

}

