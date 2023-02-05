//Batch Processing using Prepared statement interface.
package com.Pinky1;

import java.sql.*;
import java.io.*;
public class BatchProcess3 {

	public static void main(String[] args) {
		String query="INSERT INTO Table10(tName,tCity) VALUES(?,?)";
		try {
Connection con=ConnectionProvider.getConnection();
System.out.println("Connection successful!!!!!!!!!!!");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

PreparedStatement psmt=con.prepareStatement(query);
while(true)
{
	System.out.println("Enter name: ");
	String name=br.readLine();
	System.out.println("Enter City: ");
	String city=br.readLine();
	psmt.setString(1, name);
	psmt.setString(2, city);
	psmt.addBatch();
	System.out.println("Do you want to insert more records:(y/n)...");
	String answer=br.readLine();
	if(answer.equals("n"))
	{
		break;
	} 
	
}
int[] x=psmt.executeBatch();
System.out.println(x.length +"...:Records successfully inserted!!!!!!!!!!!");

	}catch(Exception e) {
		e.printStackTrace();
	}
	}

}
