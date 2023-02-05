package com.myPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/viewemployee")
public class ViewEmployee extends HttpServlet {
	String JDBCURL="jdbc:mysql://localhost:3306/pinky?useSSL=false";
	String Username="root";
	String Password="";
	Connection con=null;
	ResultSet rs;
	int row;
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {  

		response.setContentType("text/html");  
        PrintWriter out=response.getWriter(); 
        try {
            
    		Connection con=null;
    	    out.println("Connecting to database...............");
    		con=DriverManager.getConnection(JDBCURL,Username,Password);
    		String query="SELECT * FROM employee";
    		Statement smt=con.createStatement();
    		rs=smt.executeQuery(query);
            out.println("<table border=1>");
            out.println("<tr>");
    		out.println("<td>Employee Id </td>");
    		out.println("<td>First Name</td>");
    		out.println("<td>Last Name</td>");
    		out.println("<td>Edit</td>");
    		out.println("<td>Delete</td>");
    		out.println("</tr>");
    		while(rs.next())
    		{out.print("<tr>");
    		out.print("<td>"+rs.getString(1)+"</td>");
    		out.print("<td>"+rs.getString(2)+"</td>");
    		out.print("<td>"+rs.getString(3)+"</td>");
    		out.print("<td>"+"<a href='EditReturn?id="+rs.getString("ID")+"'>Edit</a>"+"</td>");
    		out.print("<td>"+"<a href='Delete?id="+rs.getString("ID")+"'>Delete</a>"+"</td>");

    		out.print("</tr>");
    		}

            }
    		catch(Exception e)
		{e.printStackTrace();
        }
}
	}