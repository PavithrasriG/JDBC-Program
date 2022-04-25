package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SingleRecordIsDisplay {

	public static void main(String[] args) {

        // based on id fetch the record
		
		//Connection 
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/mydb"; //mydb is the database name of mysql
		String un="root";
		String pass="root";
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;   // all the record will be fetch
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id to fetch record"); // particular id details is display
		int userid=sc.nextInt();
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,un,pass);
			st=conn.createStatement();
			String sql="select * from login2 where userid="+userid;     // id sql comment, get only one row
			// check id exists
			rs=st.executeQuery(sql);
			if(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			else {
				System.out.println("user not exists");
			}}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
