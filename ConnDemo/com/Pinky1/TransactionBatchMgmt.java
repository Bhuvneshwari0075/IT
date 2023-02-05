package com.Pinky1;
import java.sql.*;
public class TransactionBatchMgmt {

	public static void main(String[] args) throws SQLException {
		System.out.println("Connecting to database...............");
		Connection con=ConnectionProvider.getConnection();
		System.out.println("Connection is successful!!!!!!!!!!!");
		Statement stmt=con.createStatement();
		con.setAutoCommit(false);
		try {
		stmt.addBatch("DELETE FROM student WHERE StudentId=110");
		stmt.addBatch("INSERT INTO teacher VALUES(144,108,'Science',55434)");
	    stmt.executeBatch();
	    con.commit();
	    System.out.println("Transaction is completed!!!!!!!!!!");
	}
		catch(Exception e)
		{con.rollback();
		System.out.println("Transaction incomplete??????????");
		}

}
}
