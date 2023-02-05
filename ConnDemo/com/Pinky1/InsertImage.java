package com.Pinky1;

import java.sql.*;
import java.io.*;

public class InsertImage {

	public static void main(String[] args) {
		String JDBCURL="jdbc:mysql://localhost:3306/pinky?useSSL=false";
		String Username="root";
		String Password="";
		Connection con=null;
		//String query="CREATE TABLE Images(id int PRIMARY KEY AUTO_INCREMENT,pic blob)";
		String query="INSERT INTO Images(pic) VALUES(?)";
		
		
		try {
			System.out.println("Connecting to database..............."+JDBCURL);
			con=DriverManager.getConnection(JDBCURL, Username, Password);
			System.out.println("Connection is successful!!!!!!!!!!!");
			PreparedStatement pstmt=con.prepareStatement(query);
			FileInputStream fis= new FileInputStream("PukkuNdMe.JPEG");
			pstmt.setBinaryStream(1, fis,fis.available());
			pstmt.executeUpdate();
			System.out.println("Image inserted!!!!!!!!!!!!!!");
	}
		catch(Exception e) {
			e.printStackTrace();
			
			}
	}

}
