package com.Pinky1;

import java.sql.*;

public class CallableProc {

	public static void main(String[] args) {
		try {
			System.out.println("Connecting to database...............");
			Connection con=ConnectionProvider.getConnection();
			System.out.println("Connection is successful!!!!!!!!!!!");

			CallableStatement stmt=con.prepareCall("{call inParam(100)}");
			stmt.execute();
	}catch(Exception e)
		{e.printStackTrace();}

}
}
