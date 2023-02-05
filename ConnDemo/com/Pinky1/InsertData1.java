package com.Pinky1;

import java.sql.*;

public class InsertData1 {

	public static void main(String[] args) {
		String JdbcURL = "jdbc:mysql://localhost:3306/pinky?useSSL=false";
	      String Username = "root";
	      String password = "";
	      Connection con = null;
	      String query="CREATE TABLE Table10(tID int(20)PRIMARY KEY AUTO_INCREMENT,tName varchar(40) NOT NULL,tCity varchar(40))";
	      try {
	    	  System.out.println("Connecting to database..............."+JdbcURL);
		         con=DriverManager.getConnection(JdbcURL, Username, password);
		         System.out.println("Connection is successful!!!!!!");
		         Statement smt=con.createStatement();
		         smt.executeUpdate(query);
		         System.out.println("Table is created");
	      }
	
	      catch(Exception e) {
		         e.printStackTrace();
	}
}
}