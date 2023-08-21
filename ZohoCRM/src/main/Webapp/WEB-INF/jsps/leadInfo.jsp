<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h2>Leads Information ::::</h2>
	First Name : ${leads.first_name}<br/>
	Last Name : ${leads.last_name}<br/>
	Company : ${leads.company}<br/>
	Email : ${leads.email}<br/>
	Mobile : ${leads.mobile}<br/>
	Lead Source : ${leads.lead_source}<br/>

	<form action="contacts" method="post">
	    <input type="hidden" name="id" value="${leads.id}" /><br>
	    <input type="hidden" name="first_name" value="${leads.first_name}" /><br>
		<input type="hidden" name="last_name" value="${leads.last_name}" /><br>
		<input type="hidden" name="company" value="${leads.company}" /><br>
		<input type="hidden" name="email" value="${leads.email}" /><br>
		<input type="hidden" name="mobile" value="${leads.mobile}" /><br> 
	    <input type="hidden" name="lead_source" value="${leads.lead_source}" /><br>
		<input type="submit" value="Convert to sales" />
	</form>

	${msg}
</body>
</html>