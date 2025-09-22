<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% String s= (String)request.getAttribute("name");
		out.println("name of student is ="+ s);
	%>
	
	<h1><%=s%></h1>
	
	<h1>name of Student is ${name}</h1>
</body>
</html>