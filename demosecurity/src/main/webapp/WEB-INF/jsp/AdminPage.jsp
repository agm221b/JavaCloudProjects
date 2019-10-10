<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Pages</title>
</head>
<body>
<h2>In admin</h2>
<p align="left"><a href="/user">User</a></p>


<form action="<%=request.getContextPath()%>/logout" method="POST">
        <input type="submit" value="Logout"/>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/> 
      </form> 

</body>
</html>