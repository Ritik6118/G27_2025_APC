<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="submit" method="post">
		<label for="name">Name:</label><br> <input type="text" id="name"
			name="user_name" required><br>
		<br> <label for="email">Email:</label><br> <input
			type="email" id="email" name="user_email" required><br>
		<br> <input type="submit" value="Submit">
	</form>
</body>
</html>