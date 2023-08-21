<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="Menu.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>All Leads</h2>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Company</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Leads Source</th>
			<th>Update Leads</th>
			<th>Delete Leads</th>
		</tr>
		<c:forEach items="${leads}" var="leads">
			<tr>
				<td>${leads.id}</td>
				<td><a href="getLeadsInfo?id=${leads.id}">${leads.first_name}</a></td>
				<td>${leads.last_name}</td>
				<td>${leads.company}</td>
				<td>${leads.email}</td>
				<td>${leads.mobile}</td>
				<td>${leads.lead_source}</td>
				<td><a href="updateLeadsInfo?id=${leads.id}">UPDATE</a></td>
				<td><a href="deleteLeadsInfo?id=${leads.id}">DELETE</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>