package com.myPackage;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	String JDBCURL="jdbc:mysql://localhost:3306/pinky?useSSL=false";
	String Username="root";
	String Password="";
	Connection con=null;
	ResultSet rs;
	int row;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
	
	        out.println("<html><body>"); 
	try {
		Connection con=null;
	    out.println("Connecting to database...............");
		con=DriverManager.getConnection(JDBCURL,Username,Password);
		out.print("<br>");
		out.println("Connection is successful!!!!!!!!!!!");
		String query="SELECT * FROM student WHERE StudentID=?";
		PreparedStatement smt=con.prepareStatement(query);
		int id=Integer.parseInt(request.getParameter("StudentRollNo"));
		smt.setInt(1, id);
		ResultSet rs=smt.executeQuery();
		out.println("<table border=1 width=50% height=50% style='background-color: #D6EEEE'> ");  
        out.println("<tr><th>StudentId</th><th>StudentName</th><th>Student Hindi Marks</th><th>Student Maths Marks</th><th>Student English Marks</th><tr>");  
		while (rs.next()) 
        {  
			int rollNo = rs.getInt("StudentID"); 
            String name = rs.getString("StudentName"); 
            int hindiMarks = rs.getInt("Student Hindi Marks");  
            int mathsMarks = rs.getInt("Student Maths Marks");  
            int englishMarks = rs.getInt("Student English Mark"); 
            out.println("<tr><td style=text-align:center>" + rollNo + "</td><td style=text-align:center>" + name  + "</td><td style=text-align:center>" + hindiMarks + "</td><td style=text-align:center>" + mathsMarks+ "</td><td style=text-align:center>" + englishMarks + " </td></tr>");   
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
