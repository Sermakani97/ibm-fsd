<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
firstName<form:input path="firstName"/></br>
lastName<form:input path="lastName"/></br>
Country:<form:select path="country">
<form:options items="${student.countryOptions}"/>
</form:select>
<br><br>	Favorite Language:
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />
		<br><br>
		operating system:
		Linux<form:checkbox path="operatingSystems" value="linux"/> 
		Mac Os<form:checkbox path="operatingSystems" value="Mac Os"/>
		MS windows<form:checkbox path="operatingSystems" value="MS Windows"/>
<input type="submit">
</form:form>
</body>
</html>