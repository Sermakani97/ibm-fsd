package comm.exam.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import comm.exam.model.Employee;


/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet{
	
	private Connection connection=null;
	private PreparedStatement pStatement=null;
	private Statement statement=null;
	private ResultSet resultSet=null;
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }
  	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doProcess(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("<form id=\"form-1\" action=\"AddEmployeeController\" method=\"post\"><label for =\"input-1\">name</label>\r\n" + 
				"	\r\n" + 
				"	<input type=\"text\" id=\"input-1\" required=\"true\" name=\"name\"/>\r\n" + 
				"	<label for =\"input-2\">Email</label>\r\n" + 
				"	\r\n" + 
				"	<input type=\"text\" id=\"input-2\" required=\"true\" name=\"email\"/>\r\n" + 
				"	<label for =\"input-3\">password</label>"
				+ "<input type=\"text\" id=\"input-1\" required=\"true\" name=\"password\"/>"
		
				+"<label for =\"input-3\">Country</label>\r\n" + 
				"	<select name=\"country\">\r\n" + 
				"	<option value=\"unknown\">Select...</option>\r\n" + 
				"	<option value=\"India\">INDIA</option>\r\n" + 
				"	<option value=\"UK\">UK</option>\r\n" + 
				"	<option value=\"USA\">USA</option></select>"
				+ "<input type=\"submit\" id=\"button-1\" value=\"AddEmployee\"/>"
				+ "</form>");
	}
	
}
