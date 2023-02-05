package com.sendRedirect;

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
public class demoServlet1 extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  
			{  
			res.setContentType("text/html");  
			PrintWriter pw=res.getWriter();  
			//res.sendRedirect("http://www.google.com"); 
			//pw.close();  
		 String name=req.getParameter("name");  
	        res.sendRedirect("https://www.google.co.in/#q="+name);  
		
//		 response.setContentType("text/html");
//         PrintWriter pwriter = response.getWriter();
//
//         String name = request.getParameter("userName");
//         String password = request.getParameter("userPassword");
//         pwriter.print("Hello "+name+"<br>");
//         pwriter.print("Your Password is: "+password);
//
//         //Creating two cookies
//         Cookie c1=new Cookie("userName",name);
//         Cookie c2=new Cookie("userPassword",password);
//         c1.setMaxAge(365*24*60*60);
//         c2.setMaxAge(365*24*60*60);
//         //Adding the cookies to response header
//         response.addCookie(c1);
//         response.addCookie(c2);
//         pwriter.println("<br><a href='welcome'>View Details</a>");
         pw.close();
			}
	}  

