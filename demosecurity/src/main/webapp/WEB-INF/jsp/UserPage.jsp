<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Pages</title>
</head>
<body>
<h3>
In user page</h3>

<p align="left"><a href="/admin">Admin</a></p>

<form action="<%=request.getContextPath()%>/logout" method="POST">
        <input type="submit" value="Logout"/>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/> 
      </form> 


</body>
</html>