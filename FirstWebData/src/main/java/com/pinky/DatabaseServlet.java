package com.pinky;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

//import java.sql.SQLException;
//@WebServlet("/s1")
public class DatabaseServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
	
	out.println("<html><body>"); 
	try {
		String JDBCURL="jdbc:mysql://localhost:3306/pinky?useSSL=false";
		String Username="root";
		String Password="";
		Connection con=null;
	    out.println("Connecting to database...............");
		con=DriverManager.getConnection(JDBCURL,Username,Password);
		out.print("<br>");
		out.println("Connection is successful!!!!!!!!!!!");
		String query="SELECT * FROM table10";
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery(query);
		out.println("<table border=1 width=50% height=50%>");  
        out.println("<tr><th>EmpName</th><th>EmpCity</th><th>EmpID</th><tr>");  
		while (rs.next()) 
        {  
            String name = rs.getString("tName");  
            String city = rs.getString("tCity");  
            int id = rs.getInt("tID");   
            out.println("<tr><td style=text-align:center>" + name + "</td><td style=text-align:center>" + city + "</td><td style=text-align:center>" + id + "</td></tr>");   
        }  
        out.println("</table>");  
        out.println("</body></html>");  
        
       }  
        catch (Exception e) 
       {  
        e.printStackTrace();  
		}
		 
	}
	
}

