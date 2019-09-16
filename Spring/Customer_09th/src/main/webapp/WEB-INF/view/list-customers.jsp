<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Customers</title>
	</head>

<body>
		
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempCustomer" items="${customers}">
				
					<tr>
						<td> ${tempCustomer.firstName} </td>
						<td> ${tempCustomer.lastName} </td>
						<td> ${tempCustomer.email} </td>
						<td><a href="deleteCustomers/${tempCustomer.id}">Delete</a></td> 
						<td><a href="showFormForUpdate/${tempCustomer.id}">update</a></td>
					</tr>
				
				</c:forEach>
						
			</table>
			<input type="button" value="Add Customer"
				   onclick="window.location.href='Customer-home'; return false;"
				   class="add-button"
			/>
			</body>

</html>