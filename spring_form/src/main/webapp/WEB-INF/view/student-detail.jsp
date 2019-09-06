<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
first name:${tempStudent.firstName }
Last name:${tempStudent.lastName }
<br><br>

Country: ${tempStudent.country}

<br><br>

Favorite Language: ${tempStudent.favoriteLanguage}
<br><br>

OperatingSystem:
 <c:forEach items="${tempStudent.operatingSystems }" var="current">
 <c:out value = "${current}"/>
 </c:forEach>
</body>
</html>