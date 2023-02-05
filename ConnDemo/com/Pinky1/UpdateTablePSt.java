package com.Pinky1;

import java.sql.*;
import java.io.*;

public class UpdateTablePSt {

				public static void main(String[] args) {
				String JdbcURL = "jdbc:mysql://localhost:3306/pinky?useSSL=false";
			      String Username = "root";
			      String password = "";
			      Connection con = null;
			      //String query="DELETE FROM Table10 WHERE tID=?";
			      String query="UPDATE Table10 SET tName=? WHERE tID=?";
			      try {
			    	     System.out.println("Connecting to database..............."+JdbcURL);
				         con=DriverManager.getConnection(JdbcURL, Username, password);
				         System.out.println("Connection is successful!!!!!!");
		                 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		                 System.out.println("Enter name..");
		                 String name=br.readLine();
		                  System.out.println("Enter ID..");
		                 int id=Integer.parseInt(br.readLine());
		                 PreparedStatement pstmt=con.prepareStatement(query);
		                 pstmt.setString(1, name);
		                 pstmt.setInt(2, id);
		                 pstmt.executeUpdate();
		                 System.out.println("Data is updated......");
			      }
			      catch(Exception e)
			      {e.printStackTrace();
			      }
			}
			      


	}


