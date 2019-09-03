<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
    <head><title>Hello</title></head>
    <body bgcolor="white">
       
        <form method="post" action="add_league.do">
        <label for ="input-1">Title</label>
            <input type="text" name="title" size="25">
             <label for ="input-1">Year</label>
            <input type="text" name="year" size="10">
             <label for ="input-1">Season</label>
            <select name="season">
	<option value="unknown">Select...</option>
	<option value="Summer">Summer</option>
	<option value="Autumn">Autumn</option>
	<option value="Spring">Spring</option></select>
	
            <input type="submit" value="Submit">
            <input type="reset" value="Reset">
        </form>
        <%int f=0; %>
        <c:if test="${ERROR!=NULL}" >
             <jsp:include page="error.jsp"/>   
       <%  f=1;%>
        </c:if>
        <c:if test="${f==0}"> 
         <%out.println("success"); %>
        
        <c:if test="${ERROR==NULL}" >
      <%out.println("success"); %>
          <jsp:include page="success.jsp"/>
        </c:if>
        </c:if>
   
    </body>
</html>