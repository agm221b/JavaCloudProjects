<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="fo" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Add Product
	<table>
		<fo:form action="pagesubmit" method="POST" modelAttribute="model">
			<tr>
				<td>Product ID</td>
				<td><fo:input path="prodId" /></td>
			</tr>
			
			<tr>
				<td>Product Name</td>
				<td><fo:input path="prodName" /></td>
			</tr>

			<tr>
				<td>Product Price</td>
				<td><fo:input path="prodPrice" /></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</fo:form>
	</table>
	
</body>
</html>