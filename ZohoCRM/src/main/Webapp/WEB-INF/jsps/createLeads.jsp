<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file="Menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    
	<h2>Enter Customer Info</h2>
	<form action="saveLead" method="post">
		<pre>
           First Name<input type="text" name="first_name" />
           Last Name<input type="text" name="last_name" />
           Company<input type="text" name="company" />
           Email<input type="text" name="email" />
           Mobile<input type="text" name="mobile" />
           <label for="lead_source">Choose Leads Source</label>
           <select name="lead_source" id="leads">
                 <option>--select--</option>
                 <option value="Paper Ads">Paper Ads</option>
                 <option value="TV Ads">TV Ads</option>
                 <option value="Online">Online</option>
                 <option value="Radio">Radio</option>
           </select> <br> <br>
           <input type="submit" value="Save Lead" />
       </pre>
	</form>
	${msg}
</body>
</html>