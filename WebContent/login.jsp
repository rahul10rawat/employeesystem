<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Welcome to 'Employee Management Console' application </h1>

<h1 style="text-decoration: underline">Logins Screen</h1>
<p style='color:red'> ${msg} </p>
<form action="login" method="post">
<table border="1px">
<tr>
<td>UserID <input type="text" name="userid"></td>
</tr>
<tr>
<td>Password <input type="password" name="password"></td>
</tr>
<tr>
<td>Role <input type="role" name="role"></td>
</tr>
<tr>
<td><input type="submit" name="submit" value="Login"></td>
</tr>
</form>
</table>
</div>
</body>
</html>