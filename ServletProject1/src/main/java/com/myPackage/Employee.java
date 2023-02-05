package com.myPackage;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/employee")
public class Employee extends HttpServlet {
	String JDBCURL="jdbc:mysql://localhost:3306/pinky?useSSL=false";
	String Username="root";
	String Password="";
	Connection con=null;
	PreparedStatement pst;
	int row;

	 public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter(); 
            try {
           
    		Connection con=null;
    	    out.println("Connecting to database...............");
    		con=DriverManager.getConnection(JDBCURL,Username,Password);
    		String empId=request.getParameter("empid");
    		String fname=request.getParameter("fname");
    		String lname=request.getParameter("lname");
    		pst=con.prepareStatement("INSERT INTO employee(ID,fname,lname) values(?,?,?)");
    		pst.setString(1,empId);
    		pst.setString(2,fname);
    		pst.setString(3,lname);
    		row=pst.executeUpdate();
    		out.println("<font color='green'> Record Added </font>");
    		

}
            catch(Exception e)
            {e.printStackTrace();
            out.println("<font color='red'> Record failed </font>");
            }
            }
            }
