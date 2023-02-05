<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css">
<title>Insert title here</title>
</head>
<body>
Current time: <%= java.util.Calendar.getInstance().getTime() %> 
<form action="first.jsp">
<input type="text" name="uname">
<input type="number" name="cubicNumber">
<input type="submit" value="go"><br/>
</form>
</body>
</html>