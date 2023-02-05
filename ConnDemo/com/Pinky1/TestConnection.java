package com.Pinky1;
import java.sql.*;
public class TestConnection {

			public static void main(String[] args) {
	
	String query="CREATE TABLE TestTable(tID int(20)PRIMARY KEY AUTO_INCREMENT,tName varchar(40) NOT NULL,tCity varchar(40))";
		try {
		System.out.println("Connecting to database...............");
		Connection con=ConnectionProvider.getConnection();
		System.out.println("Connection is successful!!!!!!!!!!!");
		Statement smt=con.createStatement();
		smt.executeUpdate(query);
		System.out.println("Your table is created....");
	}
	catch(Exception e) {
		e.printStackTrace();
		
		}
		}

	}
