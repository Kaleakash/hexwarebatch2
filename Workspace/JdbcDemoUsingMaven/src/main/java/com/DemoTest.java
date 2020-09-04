package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DemoTest {

	public static void main(String[] args) throws Exception{
	//Load the driver 
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded successfully..");
		//Establish the connection 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
		System.out.println("Connected successfully...");
		Emp emp = new Emp();
		emp.setId(103);
		emp.setName("Dinesh");
		emp.setSalary(20000);
		//We can create Statement, PreparedStatement or CallableStatement 
		//Insert Query
		/*PreparedStatement pstmt = con.prepareStatement("insert into emp values(?,?,?)");
		pstmt.setInt(1, emp.getId());
		pstmt.setString(2, emp.getName());
		pstmt.setFloat(3, emp.getSalary());
		int res = pstmt.executeUpdate();
		if(res>0) {
			System.out.println("Record stored....");
		}
		*/
		//Delete Query 
		/*PreparedStatement pstmt = con.prepareStatement("delete from emp where id =?");
		pstmt.setInt(1, 100);
		int res = pstmt.executeUpdate();
		if(res>0) {
			System.out.println("Delete deleted....");
		}else {
			System.out.println("Record not present");
		}*/
		//Update Query 
		/*PreparedStatement pstmt = con.prepareStatement("update emp set salary = salary+? where id =?");
		pstmt.setFloat(1, 500);
		pstmt.setInt(2, 111);
		int res = pstmt.executeUpdate();
		if(res>0) {
			System.out.println("Record updated successfully.");
		}else {
			System.out.println("Record not present");
		}*/
		//Retrieve records 
		PreparedStatement pstmt = con.prepareStatement("select * from emp");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			System.out.println("Id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
		}
		con.close();
	}

}
