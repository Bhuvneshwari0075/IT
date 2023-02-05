package com.myPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/EditReturn")
public class EditReturn extends HttpServlet {
	String JDBCURL="jdbc:mysql://localhost:3306/pinky?useSSL=false";
	String Username="root";
	String Password="";
	Connection con=null;
	PreparedStatement ps;
	ResultSet rs;
	int row;
	public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter(); 
            String empid=request.getParameter("id");
            try {
           
    		Connection con=null;
    	    out.println("Connecting to database...............");
    		con=DriverManager.getConnection(JDBCURL,Username,Password);
    		ps=con.prepareStatement("SELECT * FROM employee WHERE ID=?");
    		ps.setString(1, empid);
    		rs=ps.executeQuery();
    		while(rs.next())
    		{out.println("<form action='EditServlet' method='POST'>");
    		out.println("<table border=1>");
    		out.println("<tr><td> EmpID </td><td><input type='text' name='eid' value=' "+rs.getString("ID")+"'/></td></tr>");
    		out.println("<tr><td> FirstName</td><td><input type='text' name='fname' value=' "+rs.getString("fname")+"'/></td></tr>");
    		out.println("<tr><td> LastName </td><td><input type='text' name='lname' value=' "+rs.getString("lname")+"'/></td></tr>");
    		out.println("<tr><td colspan='2'><input type='submit' name='submit' value='Edit'/></td></tr>");

    		 out.println("</table>");
    		 out.println("</form>");

    		}
            }catch(Exception e)
            {e.printStackTrace();
            out.println("<font color='red'> Record failed </font>");
            }
             		
    		
}
