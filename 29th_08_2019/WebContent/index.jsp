<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
    <head><title>Hello</title></head>
    <body bgcolor="white">
        
   
        <form method="get">
            <input type="text" name="username" size="25">
            <p></p>
            <input type="submit" value="Submit">
            <input type="reset" value="Reset">
        </form>

        <c:if test="${fn:length(param.username) > 0}" >
        
           
            <jsp:include page="process.jsp"/>
            
            
        </c:if>
    </body>
</html>