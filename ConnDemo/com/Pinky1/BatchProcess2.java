package com.Pinky1;

import java.sql.*;

public class BatchProcess2 {

	public static void main(String[] args) {
		String query="INSERT INTO Table10(tName,tCity) VALUES('Mehar','Dehradun')";
		String query1="INSERT INTO Table20(tName,tCity) VALUES('Delnas','Chd')";

		try {
			//to add connection in your current program use following code
			Connection con=ConnectionProvider.getConnection();
			System.out.println("Connection established!!!!!!!");
			Statement smt=con.createStatement();
			smt.addBatch(query);
			smt.addBatch(query1);
			smt.executeBatch();
			System.out.println("Data updated!!!!!!!!!!!");
		}catch(Exception e)
		{e.printStackTrace();
			
		}
	}

}
