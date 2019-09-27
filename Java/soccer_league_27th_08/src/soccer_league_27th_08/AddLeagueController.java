package soccer_league_27th_08;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddLeagueController
 */@WebServlet("/add_league.do")

public class AddLeagueController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      private String season,title,year;
      private int iYear;
      private List<String> list;
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	try {
		doProcess(request,response);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		// TODO Auto-generated method stub
		list=new LinkedList<String>();
		
		season=request.getParameter("season");
		if(season.equals("unknown")) {
			list.add("pls add valid one");
		}
		year=request.getParameter("year");
		try {
			iYear=Integer.parseInt(year);
		}
		catch(Exception e)
		{
			list.add("yr must be numeric");
		}
		title=request.getParameter("title");
if(title.length()<5)
{
	list.add("title is too short");
}
if(list.isEmpty()) {
	request.setAttribute("SUCCESS", new League(title,season,iYear));
	Connection connection=MyConnectionFactory.getMySqlConnectionForHR();
	PreparedStatement pst=connection.prepareStatement("insert into league(title,season,year,uid) values(?,?,?,?)");
	pst.setString(1, title);
	pst.setString(2, season);
	pst.setInt(3, iYear);
	pst.setInt(4, League.serialVersionUID++);
	pst.executeUpdate();
	RequestDispatcher view=request.getRequestDispatcher("success.view");
	view.forward(request, response);
}
else {
	request.setAttribute("ERROR", list);
	RequestDispatcher view=request.getRequestDispatcher("error.view");
	view.forward(request, response);
}
	}

}
