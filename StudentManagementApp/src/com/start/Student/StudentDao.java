package com.start.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDao {
	public static boolean addStudentToDB(Student s)
	{
		boolean status=false;
		try
		{
			Connection con=ConnectionProvider.creatConnection();
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

}
