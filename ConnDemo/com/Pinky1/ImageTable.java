package com.Pinky1;

import java.sql.*;


public class ImageTable {

	public static void main(String[] args) {
		String JDBCURL="jdbc:mysql://localhost:3306/pinky?useSSL=false";
		String Username="root";
		String Password="";
		Connection con=null;
		String query="CREATE TABLE Images(id int PRIMARY KEY AUTO_INCREMENT,pic blob)";
		
		try {
			System.out.println("Connecting to database..............."+JDBCURL);
			con=DriverManager.getConnection(JDBCURL, Username, Password);
			System.out.println("Connection is successful!!!!!!!!!!!");
			Statement smt=con.createStatement();
			smt.executeUpdate(query);
			System.out.println("Your table is created....");
		}
		catch(Exception e) {
			e.printStackTrace();
			
			}
			}

		
	}


