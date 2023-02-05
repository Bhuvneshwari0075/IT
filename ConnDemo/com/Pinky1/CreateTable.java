//creating a table in database "pinky" using JDBC
package com.Pinky1;

import java.sql.*;

public class CreateTable {

	public static void main(String[] args) {
String JDBCURL="jdbc:mysql://localhost:3306/pinky?useSSL=false";
String Username="root";
String Password="";
Connection con=null;
String query="CREATE TABLE Table20(tID int(20)PRIMARY KEY AUTO_INCREMENT,tName varchar(40) NOT NULL,tCity varchar(40))";
	try {
	System.out.println("Connecting to database..............."+JDBCURL);
	con=DriverManager.getConnection(JDBCURL, Username, Password);
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
