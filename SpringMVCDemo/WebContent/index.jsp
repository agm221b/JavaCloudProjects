<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	Welcome, Peasant. Wello

	<form>
		ID:<br> <input type="text" name="id"><br> Name:<br>
		<input type="text" name="name"><br> <br> <br>Technology<br>
		<input type="checkbox" name="technology1" value="Java"> Java &emsp;
		<input type="checkbox" name="technology2" value="C#"> C#<br>
		<input type="checkbox" name="technology3" value="Angular">
		Angular &emsp; <input type="checkbox" name="technology4"
			value="Python"> Python3 <br> <input type="checkbox"
			name="technology5" value="React"> React &emsp; <input
			type="checkbox" name="technology6" value="AWS"> AWS<br>
		<br> <br> <br>Gender: <br> <input type="radio"
			name="gender" value="male" checked> Male<br> <input
			type="radio" name="gender" value="female"> Female<br> <br>
		<br> <br>Qualification: <br> <select
			name="qualification">
			<option value="Select">Select</option>
			<option value="MSc">MSc</option>
			<option value="BE">BE</option>
			<option value="BTech">BTech</option>
			<option value="MBA">MBA</option>
		</select> <input type="submit" value="Submit">

	</form>
</body>
</html>