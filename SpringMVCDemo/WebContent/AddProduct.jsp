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
				<td><span><fo:errors path="prodId"></fo:errors></span></td>
			</tr>
			
			<tr>
				<td>Product Name</td>
				<td><fo:input path="prodName" /></td>
				<td><span><fo:errors path="prodName" delimiter=","></fo:errors></span></td>
			</tr>

			<tr>
				<td>Product Price</td>
				<td><fo:input path="prodPrice" /></td>
				<td><span><fo:errors path="prodPrice"></fo:errors></span></td>
			</tr>
			
			<tr>
				<td>Product Type</td>
				<td><fo:select path="type" items="${dataitem}"/></td>
			</tr>
			
			<tr>
				<td>Product Availability</td>
				<td><fo:radiobutton path="online" value="online"/> Online</td>
				<td><fo:radiobutton path="online" value="offline"/> Offline</td>
			</tr>
			
			<tr>
				<td>Product Features</td>
				<td><fo:checkboxes path="features" items="${datafeatures}"/></td>
				<td><span><fo:errors path="features" ></fo:errors></span></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</fo:form>
	</table>
	
</body>
</html>