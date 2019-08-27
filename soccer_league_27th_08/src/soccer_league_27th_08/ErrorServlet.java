package soccer_league_27th_08;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ErrorServlet
 */

@WebServlet("/error.view")
public class ErrorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	
		@SuppressWarnings("unchecked")
		List<String> err=(List<String>)request.getAttribute("ERROR");
		for(String s:err)
		{
			out.println("<p style=\"color:red;\">"+s+"</p><br/>");
			out.println("<input type=\"reset\" value=\"Back\" id=\"button-2\" onclick=\"document.location.href='add_league.html';\"/>");
		
		}
}}

	