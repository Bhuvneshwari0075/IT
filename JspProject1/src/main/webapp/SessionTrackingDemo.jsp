<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="SessionTrackingDemo.jsp">
Add new item: <input type="text" name="item">
               <input type="submit" value="Add Item">
               </form>
               <br/>
   
 <% List<String> myStuff=(List<String>)session.getAttribute("myToDoList");
 if(myStuff==null)
 {
  myStuff=new ArrayList<String>();
  session.setAttribute("myToDoList",myStuff);
 }
 String item=request.getParameter("item");
 if(item!=null)
 {
	 myStuff.add(item);
	 
 }
%>
<hr>
<b>To Do List Items:</b><br/>
<ol>
<% 
for(String temp:myStuff)
{
	out.println("<li>"+temp+"</li>");
}
%>
</ol>
</body>
</html>