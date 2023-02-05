package com.Pinky1;

import java.sql.*;

public class InsertData2 {

	public static void main(String[] args) {
		String JDBCURL="jdbc:mysql://localhost:3306/pinky?useSSL=false";
		String Username="root";
		String Password="";
		Connection con=null;
		String query="INSERT INTO table2(tName,tCity) VALUES(?,?)";//parameterized queries
			try {
			System.out.println("Connecting to database..............."+JDBCURL);
			con=DriverManager.getConnection(JDBCURL, Username, Password);
			System.out.println("Connection is successful!!!!!!!!!!!");
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1,"Nelesh");
			pstmt.setString(2,"Surrey");
			pstmt.executeUpdate();
			System.out.println("Data inserted in the table....");
			
			}
			catch(Exception e)
			{e.printStackTrace();
			}
			}
			

}
