package com.sendRedirect;

//import javax.servlet.http.HttpServlet;
import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
public class demoServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)  
			throws ServletException,IOException  
			{  
//			res.setContentType("text/html");  
//			PrintWriter pw=res.getWriter();  
//			  
//			res.sendRedirect("http://www.google.com");  
//			  
//			pw.close(); 
		
		 response.setContentType("text/html");
	       PrintWriter pwriter = response.getWriter();
	 
	       //Reading cookies
	       Cookie c[]=request.getCookies(); 
	       //Displaying User name value from cookie
	       pwriter.println("Name: "+c[0].getValue()+"<br>"); 
	       //Displaying user password value from cookie
	       
	       pwriter.println("Password: "+c[1].getValue());
	 
	       pwriter.close();
		
		
		
			}
	}  

