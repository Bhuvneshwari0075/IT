package com.servletConfig;

import java.util.*;
import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  

public class demoServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)  
		    throws ServletException, IOException {  
		  
		    response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		      
		    ServletConfig config=getServletConfig();//This  method creates object of ServletConfig interface 
		    ServletContext context=getServletContext();
		    context.setAttribute("phoneNumber",7633332);
		    String name=config.getInitParameter("name");//Values of InitParameter "name" is being fetched from web.xml
		    String websiteName=context.getInitParameter("websiteName");
		    out.print("Name of my website is"+websiteName+"<br>");
		    //out.println("Name is: "+name+"<br>");//value of parameter is printed.
		    
		    Enumeration<String> e=config.getInitParameterNames();
		    String str="";
		    while(e.hasMoreElements()){
		    	str=e.nextElement();
		    	out.println(str);//gets the name of the parameter
		    	out.print(config.getInitParameter(str)+"<br>");//gets the value.
		    	
		    }
		    out.println("<a href='servlet2'>Go to second Servlet"); 
		    out.close();  
		    
		    
		    }  
		  
}
