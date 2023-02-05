package com.Pinky1;

import java.sql.*;
public class RsltMetaData {

			public static void main(String[] args) {
			String JdbcURL = "jdbc:mysql://localhost:3306/pinky?useSSL=false";
		      String Username = "root";
		      String password = "";
		      Connection con = null;
		      //String query=("INSERT INTO Table10(tName,tCity) VALUES (?,?)");
		      //String query="SELECT * FROM Table10";
		      try {
		     System.out.println("Connecting to database..............."+JdbcURL);
	        con=DriverManager.getConnection(JdbcURL, Username, password);
            System.out.println("Connection is successful!!!!!!"); 
				  
		PreparedStatement ps=con.prepareStatement("SELECT * FROM Table10");//prepareStatement(query)  
		ResultSet rs=ps.executeQuery();  
		ResultSetMetaData rsmd=rs.getMetaData();  
		  
//		System.out.println("Total columns: "+rsmd.getColumnCount());  
//		System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
//		System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));
		System.out.println("-------------------");

		System.out.println("Name of the table: "+ rsmd.getTableName(1));
		System.out.println("Total number of columns in the table are: "+rsmd.getColumnCount());
		System.out.println("-------------------");
	    for(int i=1;i<= rsmd.getColumnCount();i++) {
         System.out.println("ColumnName = "+ rsmd.getColumnName(i));
         System.out.println("ColumnType = "+ rsmd.getColumnType(i)+ "   ");
         System.out.println("ColumnLabel = "+ rsmd.getColumnLabel(i)+ "   ");
         System.out.println("ColumnDisplaySize = "+ rsmd.getColumnDisplaySize(i)+ "   ");
         System.out.println("ColumnTypeName = "+rsmd.getColumnTypeName(i)+ "   ");
         System.out.println("------------------");
     }
		   
		}catch(Exception e)
		      { e.printStackTrace();
		      }  
		}  
		  

	}


