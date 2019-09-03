<%@page import="comm.exam.MyConnectionFactory"%>
<%@ page import="java.sql.*" %>
 
 <body>
 <jsp:useBean id="u" class="comm.exam.ValidateBean" scope="request">
 <jsp:setProperty name="u" property="*"/> 
 </jsp:useBean>
 You entered user name as <jsp:getProperty name="u" property="user" /> <br>
 You entered user password as <jsp:getProperty name="u" property="pass" /> <br>
<br>
<%
MyConnectionFactory factory = null;
Connection connection=MyConnectionFactory.getMySqlConnectionForHR();
Statement statement = connection.createStatement();
ResultSet rs = statement.executeQuery("select * from login");
int flag= 0;
while(rs.next()){
	if(u.validate(rs.getString("user"), rs.getString("pass"))=="VALID"){
		flag = 1;
	}
}
if(flag == 1){
	RequestDispatcher rd = request.getRequestDispatcher("addleague.jsp");
	rd.forward(request, response);
}else{
	request.setAttribute("ERROR", "Invalid user");
	RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
	rd.forward(request, response);
}
%>
<b>Thank You</b>
</body>