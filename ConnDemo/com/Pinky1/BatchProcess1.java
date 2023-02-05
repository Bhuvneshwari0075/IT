package com.Pinky1;
import java.sql.*;

public class BatchProcess1 {

	public static void main(String[] args) {
		
		String query="INSERT INTO table20(tName,tCity) VALUES('Maya','Delhi')";	
		String query1="INSERT INTO table10(tName,tCity) VALUES('Shelby','Sikkim')";	

		try {
			
		Connection con=ConnectionProvider.getConnection();
		System.out.println("Connection established.......");
		Statement smt=con.createStatement();
		smt.addBatch(query);
		smt.addBatch(query1);
		smt.executeBatch();		
		System.out.println("Data updated!!!!!!!!!!!");
		}
		catch(Exception e)
		{e.printStackTrace();
		}
		}
		

	}


