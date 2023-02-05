package com.servletConfig;

import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;

public class servlet2 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)  
		    throws ServletException, IOException 
	{  
		response.setContentType("text,html");
		PrintWriter out=response.getWriter();
		ServletContext context=getServletContext();
		int number=(Integer)context.getAttribute("phoneNumber");
		out.print(number);
		out.close();
					
	}
}
