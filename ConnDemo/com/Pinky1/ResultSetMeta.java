//Using ResultSetMetaData interface to get the information about the table and its columns.
package com.Pinky1;

import java.sql.*;

public class ResultSetMeta {

	public static void main(String[] args) {
		  String JdbcURL = "jdbc:mysql://localhost:3306/pinky?useSSL=false";
	      String Username = "root";
	      String password = "";
	      Connection con = null;
	      try {
			     System.out.println("Connecting to database..............."+JdbcURL);
		        con=DriverManager.getConnection(JdbcURL, Username, password);
	            System.out.println("Connection is successful!!!!!!"); 
	            PreparedStatement ps=con.prepareStatement("SELECT  * FROM student");
	            ResultSet rs=ps.executeQuery();
	            ResultSetMetaData rsmd=rs.getMetaData();//creating object of ResultSetMetaData interface using getMetaData() method of ResultSet object
	            System.out.println("Total columns in the table:"+rsmd.getColumnCount());//Diplaying total no. of column in the selected table.
	            System.out.println("Name of first column:"+ rsmd.getColumnName(1));//Displaying name of the first column of the table.
	            System.out.println("Type name of first column:"+ rsmd.getColumnTypeName(1));//Displaying the type of the first column in name format
	            System.out.println("Column display size of first column"+ rsmd.getColumnDisplaySize(1));//Displaying size of the first column.
	            System.out.println("Label of first column:"+ rsmd.getColumnLabel(1));///Displaying Label(Alias) of the first column if "AS" is used
	            System.out.println("Type of first column:"+ rsmd.getColumnType(1));///Displaying  type of the first column in integer format
	      }
	      catch(Exception e) {
	    	  e.printStackTrace();
	      }
	}}
	            
	            
	       
	    
	            
	            
	            
					  
	


