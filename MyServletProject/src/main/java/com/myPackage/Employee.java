package com.myPackage;

import javax.servlet.annotation.WebServlet;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/employee")
public class Employee extends HttpServlet {
	String JDBCURL="jdbc:mysql://localhost:3306/pinky?useSSL=false";
	String Username="root";
	String Password="";
	Connection con=null;
	PreparedStatement pst;
	int row;

	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {  

		response.setContentType("text/html");  
        PrintWriter out=response.getWriter(); 

		try {
			out.println("Connecting to database...");
			con=DriverManager.getConnection(JDBCURL, Username, Password);
			out.println("You are now connected...");
			String empId=request.getParameter("empId");
			String fname=request.getParameter("fname");
			String lname=request.getParameter("lname");
			pst=con.prepareStatement("INSERT INTO employee(ID,fname,lname) VALUES(?,?,?)");
			
			pst.setString(1, empId);
			pst.setString(2, fname);
			pst.setString(3, lname);
			row=pst.executeUpdate();
			out.println("<font color='green'>Record of the employee inserted!!</font>");
			
		}catch(Exception e)
		{e.printStackTrace();
}
	}
	
}