package com.start.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	public static boolean addStudentToDB(Student s)
	{
		boolean status=false;
		try
		{
			Connection con=ConnectionProvider.createConnection();
			String query="insert into student(name,phone,city) values(?,?,?)";
			PreparedStatement pstmt1=con.prepareStatement(query);
			
			pstmt1.setString(1, s.getStudentName());
			pstmt1.setString(2, s.getStudentPhone());
			pstmt1.setString(3, s.getStudentCity());
			pstmt1.executeUpdate();
			status=true;
		}
		catch(Exception e) {
			
		}
		return status;
	}
	
	public static boolean deleteStudentToDB(int studentId)
	{
		boolean status=false;
		try
		{
			Connection con=ConnectionProvider.createConnection();
			String query1="delete from student where sid=?";
			PreparedStatement pstmt1=con.prepareStatement(query1);
			
			pstmt1.setInt(1, studentId);
			pstmt1.executeUpdate();
			status=true;
			System.out.println("hey");
		}
		catch(Exception e) {
			
		}
		return status;
	}

	public static void getAllStudent() {
		try
		{
			Connection con=ConnectionProvider.createConnection();
			Statement st=con.createStatement();
			ResultSet rs= st.executeQuery("select * from student");

			while(rs.next())
			{
				int id=rs.getInt("sid");
				System.out.println("ID:"+id);
				System.out.println("Name:"+rs.getString("name"));
				System.out.println("City:"+rs.getString("city"));
				System.out.println("Phone:"+rs.getString("phone"));
				System.out.println("----------------------------------");
			}
			
		}
		catch(Exception e) {
			
		}
		
		
	}

}
