package com.Pinky1;

import java.sql.*;
public class TransactionManagement {

	public static void main(String[] args) throws SQLException {
	System.out.println("Connecting to database");
	Connection con=ConnectionProvider.getConnection();
	System.out.println("Connected successfully......");
	Statement stmt=con.createStatement();
    con.setAutoCommit(false);
	try {
		
		stmt.executeUpdate("INSERT INTO student VALUES(112,'Roxy',88,78,98)");
		stmt.executeUpdate("INSERT INTO student VALUES(113,'Shantanu',68,88,90)");
		con.commit();
		System.out.println("Transaction successful....");
	}
	catch(Exception e)
	{
		con.rollback();
		System.out.println("Transaction failed!!!!!!");
	
	}
	
	}

}
