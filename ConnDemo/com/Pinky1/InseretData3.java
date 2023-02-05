package com.Pinky1;
//Inserting data into table after accepting values from the user
import java.sql.*;
import java.io.*;
import java.util.*;

public class InseretData3 {

	public static void main(String[] args) {
		
		String JDBCURL="jdbc:mysql://localhost:3306/pinky?use SSL=false";
		String username="root";
		String password="";
		Connection con=null;
		String query="INSERT INTO table2(tName,tCity) VALUES(?,?)";	
		try {
			System.out.println("Connecting to database......"+JDBCURL);
			con=DriverManager.getConnection(JDBCURL, username, password);
			System.out.println("Connection established.....");
			PreparedStatement pstmt=con.prepareStatement(query);
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter name: ");
			String name=br.readLine();
//			int n1=Integer.parseInt(br.readLine()); to read integer values you have to parse them
//			
//			Scanner scan=new Scanner(System.in);
//			int n=scan.nextInt();
			System.out.println("Enter city name: ");
			String city=br.readLine();
			pstmt.setString(1,name);
			pstmt.setString(2,city);
			pstmt.executeUpdate();
			System.out.println("Data Inserted");
				
			
			}
		catch(Exception e) {
		//System.out.println("An error occurred");
			e.printStackTrace();
		}
		
	}

}
