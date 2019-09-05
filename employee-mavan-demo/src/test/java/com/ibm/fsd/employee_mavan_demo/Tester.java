package com.ibm.fsd.employee_mavan_demo;

import java.sql.SQLException;
import java.util.Scanner;

import comm.exam.dao.EmployeeDao;
import comm.exam.dao.EmployeeDaoImpl;

public class Tester {
	private  static String name;
	private static String email;
	private static String password;
	private static String country;
public static void main(String[] args) throws SQLException
{
	EmployeeDao emp=new EmployeeDaoImpl();
	Scanner sc=new Scanner(System.in);
	
	System.out.println("1.create\n 2.delete\3.edit");
	int choice=sc.nextInt();
	
	switch(choice)
	{
	case 1:
	
	emp.createEmployee(name,email,password,country);
     break;
	case 2:emp.deleteEmployee(name,email,password,country);
	break;
	}
}}

