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
<h1 style="text-align:center">
Current time: <%= java.util.Calendar.getInstance().getTime() %> 

<% out.println("<br>"+"welcome to my second jsp page"); 
%></h1>

<h2 style="color:red ;text-align:center">
<%
String name=request.getParameter("uname");
out.println("Welcome "+name+"<br/>");
out.println("The sum of these numbers :10,20,30 is:");
%>
</h2>
<h2 style="color:red ;text-align:center">
<%
int num1=10;
int num2=20;
int num3=30;
%>
<%=num1+num2+num3 %>
</h2>

<%!
int cube(int n){
	return n*n*n;
}
%>
<h2 style="color:red ;text-align:center">
<%= "Cube of the number is:"+cube(Integer.parseInt(request.getParameter("cubicNumber"))) %>
</h2>
</body>
</html>