package com.Pinky1;

import java.sql.*;
import java.util.*;
public class TestClass {

	public static void main(String[] args) {
		
		String JdbcURL = "jdbc:mysql://localhost:3306/pinky?useSSL=false";
	      String Username = "root";
	      String password = "";
	      Connection con = null;
	      String query=("INSERT INTO Table1(tName,tCity) VALUES (?,?)");
	      try {
	    	  System.out.println("Connecting to database..............."+JdbcURL);
		         con=DriverManager.getConnection(JdbcURL, Username, password);
		         System.out.println("Connection is successful!!!!!!");
		         PreparedStatement pstmt=con.prepareStatement(query);
		         Scanner scan=new Scanner(System.in); 
		         System.out.println("Enter Name: ");
		         String name=scan.nextLine();
		         System.out.println("Enter City: ");
		         String city=scan.nextLine();
		         pstmt.setString(1, name);
		         pstmt.setString(2, city);
		         pstmt.executeUpdate();
		         System.out.println("Data inserted");
		                  
		         
	}
	      catch(Exception e) {
		         e.printStackTrace();
	      }
	      }
}



