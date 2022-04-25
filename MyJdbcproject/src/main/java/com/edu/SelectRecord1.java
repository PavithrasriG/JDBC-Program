package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class SelectRecord1 {

	public static void main(String[] args) {
		// connection
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/mydb";
		String un="root";
		String pass="root";
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,un,pass);
			st=conn.createStatement();
			String sql="select * from edustudent";
			rs=st.executeQuery(sql);
			System.out.println("Sid\t\tSname\t\tScourse");
			
			while(rs.next()) {
				int id=rs.getInt(1);
				String n=rs.getString(2);
				String c=rs.getString(3);
				System.out.println(id+"\t\t"+n+"\t\t"+c);
				}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}}
