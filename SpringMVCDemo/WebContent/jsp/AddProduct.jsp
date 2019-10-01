<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="fo" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

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
				<td><fo:select path="type" items="${dataitem}" /></td>
			</tr>

			<tr>
				<td>Product Availability</td>
				<td><fo:radiobutton path="online" value="online" /> Online</td>
				<td><fo:radiobutton path="online" value="offline" /> Offline</td>
			</tr>

			<tr>
				<td>Product Features</td>
				<td><fo:checkboxes path="features" items="${datafeatures}" /></td>
				<td><span><fo:errors path="features"></fo:errors></span></td>
			</tr>

			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</fo:form>
	</table>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

	<!-- Latest compiled and minified JavaScript -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
		integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
		crossorigin="anonymous"></script>
</body>
</html>