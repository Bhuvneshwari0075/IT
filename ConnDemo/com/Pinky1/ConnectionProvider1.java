package com.Pinky1;

import java.sql.*;

public class ConnectionProvider1 {
	private static Connection con;
	
	public static Connection getConnection1() {
		try {
			if(con==null)
			{con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pinky?useSSL=false","root","");
			
			}
		}
			catch(Exception e)
			{e.printStackTrace();
			
			}
		return con;
		}}
		

	


