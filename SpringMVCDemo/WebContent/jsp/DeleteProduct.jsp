<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Delete Product:
	<form action="deleteproduct" method="POST">
		<table>

			<tr>
				<td>Product ID</td>
				<td><input name="pid" /></td>
			</tr>


			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>

		</table>
		</form>
</body>
</html>