
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1> Employee Management Console Dashboard  <a href="logout"> logout</a></h1>
  
<h4>You Login as '${role}' role.</h4> 
 
<%  if(request.getAttribute(("msg")).equals("Admin")) { %>
 
 <form action="empregistration" method="post"> 
	<table border="1px">
	<tr>
	<td>first_name <input  name="first_name"></td>
	</tr>
	<tr>
	<td>last_name <input  name="last_name"></td>
	</tr>
	<tr>
	<td>dob <input   name="dob"></td>
	</tr>
	<tr>
	<td>email <input  name="email"></td>
	</tr>
	<tr>
	<td>department_id <input  name="department_id"></td>
	</tr>
	<tr>
	<td><input type="submit" name="submit" value="Login"></td>
	</tr>
	</table>
</form>  

<%  }else  if(request.getAttribute(("msg").toLowerCase()).equals("hod")){  %>
<% out.println("show  HOD stuff here "); %>
<%  } else if(request.getAttribute(("msg").toLowerCase()).equals("employee")) { %>
	<% out.println("show  employee stuff here "); %>
<% } %>
</table>
</div>
</body>
</html>