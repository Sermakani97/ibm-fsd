package comm.exam.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.exam.factory.MyConnectionFactory;
import comm.exam.model.Employee;
import comm.exam.controller.EmployeeDao;
import comm.exam.controller.EmployeeDaoImpl;
/**
 * Servlet implementation class AddEmployeeController
 */
@WebServlet("/AddEmployeeController")
public class AddEmployeeController extends HttpServlet {
	private int id;
	private String name;
	private String email,country,password;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		PrintWriter out=response.getWriter();
		out.println("hello");
		List<String>err=new LinkedList<String>();
		name=request.getParameter("name");
		email=request.getParameter("email");
		password=request.getParameter("password");
		country=request.getParameter("country");
	
	
		EmployeeDaoImpl emp=new EmployeeDaoImpl();
		emp.addEmployee(name,email,password,country);
		
		
	
	}}
