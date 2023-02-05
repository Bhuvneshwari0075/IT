package com.myPackage;

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*; 
public class FirstServlet extends HttpServlet {
	  public void doGet(HttpServletRequest request,HttpServletResponse response)  
	             throws IOException  
	    {  
	    response.setContentType("image/jpeg");  
	    ServletOutputStream out;  
	    out = response.getOutputStream();  
	    FileInputStream fin = new FileInputStream("c:\\test\\PukkuNdMe.JPEG");  
	      
	    BufferedInputStream bin = new BufferedInputStream(fin);  
	    BufferedOutputStream bout = new BufferedOutputStream(out);  
	    int ch =0;  
	    while((ch=bin.read())!=-1)  
	    {  
	    bout.write(ch);  
	    }  
	      
	    bin.close();  
	    fin.close();  
	    bout.close();  
	    out.close();  
	    }  
	}  


