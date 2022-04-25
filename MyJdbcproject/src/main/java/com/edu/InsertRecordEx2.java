package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecordEx2 {

	public static void main(String[] args) {
		
		//Connection 
				String driver="com.mysql.cj.jdbc.Driver";
				String url="jdbc:mysql://localhost:3306/mydb"; //mydb is the database name of mysql
				String un="root";
				String pass="root";
				Connection conn=null;
				Statement st=null;
				ResultSet rs=null;
				Scanner sc = new Scanner(System.in);
				System.out.println("enter id to insert record");
				int userid = sc.nextInt();
				
				String sql = "select * from login2 where userid="+userid;
				
				 
						
				try {
					Class.forName(driver);
					conn = DriverManager.getConnection(url,un,pass);
					st=conn.createStatement();
					rs=st.executeQuery(sql);
					 if(!rs.next()) {
					   System.out.println("Enter name ");
					   String username=sc.next();
					   String ins="insert into login2 values("+userid+",'"+username+"')";
					   
					  int i= st.executeUpdate(ins);
					   if(i>0) {
						   System.out.println("Record is inserted successfully");
					   }
					   
					 }else {
						 System.out.println("Id already exists choose different id ");
					 }
			}catch(Exception e) {
				e.printStackTrace();
			}

		
		
	}

}
