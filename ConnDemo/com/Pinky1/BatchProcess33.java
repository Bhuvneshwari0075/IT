package com.Pinky1;

import java.sql.*;
import java.io.*;
public class BatchProcess33 {

	public static void main(String[] args) {
		String query="INSERT INTO Table10(tName,tCity) VALUES(?,?)";
		try {
			Connection con=ConnectionProvider.getConnection();
			System.out.println("Connection established.....");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			PreparedStatement pstmt=con.prepareStatement(query);
			
			while(true)
			{System.out.println("Enter name: ");
			String name=br.readLine();
			System.out.println("Enter City: ");
			String city=br.readLine();
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.addBatch();
			System.out.println("Do you want to enter more records???(y/n)...");
			String answer=br.readLine();
			if(answer.equals("n"))
			{
				break;
				}
				
			}
			int[] count=pstmt.executeBatch();
			System.out.println("Batch process successful.....");
			System.out.println(count.length+" Records inserted...");

		
		}catch(Exception e)
		{e.printStackTrace();
		}
		
		}

	}


