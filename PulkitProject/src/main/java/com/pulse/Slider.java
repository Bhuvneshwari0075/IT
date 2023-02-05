package com.pulse;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;

//@WebServlet(value= "/Slider")
public class Slider extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{  PrintWriter out=response.getWriter();
//		Cookie[] cookies = request.getCookies();
//
//		if (cookies != null) {
//		 for (Cookie cookie : cookies) {
//		   if (cookie.getName().equals("Value")) {
//			   
//			   System.out.println(cookie.getValue());}}
		
//		 Cookie ck[]=request.getCookies();  
//		    out.print("Hello "+ck[0].getValue()); 
	out.print("hi");
		   
		     //do something
		     //value can be retrieved using #cookie.getValue()
			   //request.setAttribute("Value", cookies[0].getValue()); 
		   
	}

}
