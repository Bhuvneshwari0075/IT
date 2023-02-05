package com.Pinky1;

import java.sql.*;//

public class DemoConn {
	public static void main(String[] args) {
		
	      String JdbcURL = "jdbc:mysql://localhost:3306/pinky?useSSL=false";
	      String Username = "root";
	      String password = "";
	      Connection con = null;
	      String query="Select * from Student";
	      //String query1="Insert Into Student Values('Vinay',3,'10 B',87)";
	      
	      try {
	    	
	         System.out.println("Connecting to database..............."+JdbcURL);
	         con=DriverManager.getConnection(JdbcURL, Username, password);
	         System.out.println("Connection is successful!!!!!!");
	         Statement smt=con.createStatement();
	         // int result=smt.executeUpdate(query1);//executeUpdate(String sql);
	         ResultSet rs=smt.executeQuery(query);
	         
	        // System.out.println(result+"rows affected");
	         while(rs.next()) {
	        	 String name=rs.getString(1);//getString("Name")
	        	 int roll_no=rs.getInt(2);//getInt("Roll-No")
	        	 String classSection=rs.getString(3);//getString("Class")
	        	 float marks=rs.getFloat(4);//getFloat("Marks")
	        	 System.out.println(name+" "+roll_no+" "+classSection+" "+marks);
	        	 
	        	 
	         }
	         
	      }
	      catch(Exception e) {
	         e.printStackTrace();
	      }
	     
	   }
	
	

}
