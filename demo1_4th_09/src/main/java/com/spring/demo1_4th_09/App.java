package com.spring.demo1_4th_09;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.EmployeeDAO;
import bean.EmployeeDao1;
import bean.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new 
    			ClassPathXmlApplicationContext("application.xml");
//    	 EmployeeDAO dao=context.getBean("eDao",EmployeeDAO.class);
//         dao.createEmployee(new Employee(1,"Raji","keer","sp@gg.com"));
//    	
//    	Employee emp=context.getBean("theEmployee",Employee.class);
//    	System.out.println(emp.getDetails());
//    	System.out.println(emp.getAddress());
         EmployeeDao1 dao1=context.getBean("eDao",EmployeeDao1.class);
         dao1.createEmployee(new Employee(1,"Rajii","keer","sp@gg.com"));

    }
}
