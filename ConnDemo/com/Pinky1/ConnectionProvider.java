//creating a class for reusability for providing JDBC Connection to mySql.
package com.Pinky1;

import java.sql.*;

public class ConnectionProvider {
	private static Connection con;
	
	public static Connection getConnection() {
		
		try
		{
			if(con==null)
			{
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pinky?useSSL=false","root","");
			}
		}
			catch(Exception e) {
				e.printStackTrace() ;
			}
		return con;
	}	
	
	

}
