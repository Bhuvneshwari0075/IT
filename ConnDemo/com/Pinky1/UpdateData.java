package com.Pinky1;

import java.sql.*;


public class UpdateData {
	public static void main(String[] args) {
		String JdbcURL = "jdbc:mysql://localhost:3306/pinky?useSSL=false";
	      String Username = "root";
	      String password = "";
	      Connection con = null;
	      String query="UPDATE Table10 SET tName='Shaan' WHERE tID=3";
	      try {
	    	     System.out.println("Connecting to database..............."+JdbcURL);
		         con=DriverManager.getConnection(JdbcURL, Username, password);
		         System.out.println("Connection is successful!!!!!!");
                 Statement smt=con.createStatement();
                 smt.executeUpdate(query);
                 System.out.println("Data is updated......");
		         
	      }
	      catch(Exception e)
	      {e.printStackTrace();
	      }
	}
	      }

