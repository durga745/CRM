<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="Menu.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of all Contacts</title>
</head>
<body>
	<h2>Contacts Book</h2>
	<table border=1>
		<tr>
			<th>Id</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Company</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>LeadSource</th>
			<th>Delete Contacts</th>
       </tr>
		<c:forEach items="${contacts}" var="contact">
			<tr>
				<td>${contact.id}</td>
				<td>${contact.first_name}</td>
				<td>${contact.last_name}</td>
				<td>${contact.company}</td>
				<td>${contact.email}</td>
				<td>${contact.mobile}</td>
				<td>${contact.lead_source}</td>
				<td><a href="deleteContactsInfo?id=${contact.id}">DELETE</a></td>
           </tr>
		</c:forEach>
	</table>

</body>
</html>