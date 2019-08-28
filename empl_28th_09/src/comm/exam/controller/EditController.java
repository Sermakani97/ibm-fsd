package comm.exam.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.exam.model.Employee;

/**
 * Servlet implementation class EditController
 */
@WebServlet("/EditController")
public class EditController extends HttpServlet {
	private String email;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditController() {
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
		email=request.getParameter("email");
		System.out.println(email);
		EmployeeDao emp=new EmployeeDaoImpl();
		ArrayList<Employee>list=emp.editEmployee(email);
		for(Employee e:list)
		
		out.println("<form id=\"form-1\" action=\"EditEmployeeController\" method=\"post\"><label for =\"input-1\">name</label>\r\n" + 
				"	\r\n" + 
				"	<input type=\"text\" id=\"input-1\" required=\"true\"name=\"name\" value=\'"+e.getName()+"'/>\r\n" + 
				"	<label for =\"input-2\">Email</label>\r\n" + 
				"	\r\n" + 
				"	<input type=\"text\" id=\"input-2\" required=\"true\"name=\"email\" value=\'"+e.getEmail()+"'/>\r\n" + 
				"	<label for =\"input-3\">password</label>"
				+ "<input type=\"text\" id=\"input-1\" required=\"true\"name=\"password\" value=\'"+e.getPassword()+"'/>"
		
				+"<label for =\"input-3\">Country</label>\r\n" + 
				"	<select name=\"country\">\r\n" + 
				"	<option value=\"unknown\">Select...</option>\r\n" + 
				"	<option value=\"India\">INDIA</option>\r\n" + 
				"	<option value=\"UK\">UK</option>\r\n" + 
				"	<option value=\"USA\">USA</option></select>"
				+ "<input type=\"submit\" id=\"button-1\" value=\"saveEmployee\"/>"
				+ "</form>");
	
}
	
}
