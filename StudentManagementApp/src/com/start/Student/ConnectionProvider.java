package com.start.Student;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionProvider {
	
	static Connection con;
	
	public static Connection createConnection()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		String user="root";
		String password="pass@word1";
		String url="jdbc:MySql://localhost:3306/studentmanagement";
		
			con=DriverManager.getConnection(url, user, password);	
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return con;
	}

}
