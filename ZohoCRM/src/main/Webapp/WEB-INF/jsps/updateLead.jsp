<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <h2>Update lead</h2>
	<form action="updateLead" method="post">
		<input type="hidden" name="id" value="${leads.id}" /><br>
		FirstName<input type="text" name="first_name" value="${leads.first_name}" /><br>
		LastName<input type="text" name="last_name" value="${leads.last_name}" /><br>
		Email<input type="text" name="email" value="${leads.email}" /><br>
		Mobile<input type="text" name="mobile" value="${leads.mobile}" /><br>
		LeadSource<input type="hidden" name="lead_source" value="${leads.lead_source}" /><br> 
		<input type="submit" value="update" />
	</form>
	<pre>
       </pre>
	${msg}
</body>
</html>