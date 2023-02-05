package com.Pinky1;


import java.sql.*;

public class InsertTableData {

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
		         pstmt.setString(1,"Pinky");
		         pstmt.setString(2,"Mohali");
		         pstmt.executeUpdate();
		         System.out.println("One row inserted in the table");
		         
	}
	      catch(Exception e) {
		         e.printStackTrace();
}
}
}