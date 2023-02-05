package com.Pinky1;

import java.sql.*;

public class TransactionMgmt {

	public static void main(String[] args) throws SQLException {
		
			System.out.println("Connecting to database...............");
			Connection con=ConnectionProvider.getConnection();
			System.out.println("Connection is successful!!!!!!!!!!!");
			Statement stmt=con.createStatement();
			con.setAutoCommit(false);
			try {
				stmt.executeUpdate("INSERT INTO student VALUES(109,'Maya',67,87,97)");
				stmt.executeUpdate("INSERT INTO student VALUES(110,'Vyomesh',67,87,97)");
				con.commit();
				System.out.println("Transaction is success");
			}

	       catch (Exception e)
		       {
		
		       con.rollback();
		       System.out.println("Trasaction is failed");
		        }
	        }
            }




