package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DbConnect {

	public static void main(String[] args) {
		//Make a connection with Database
				int sid;
				String sname;
				
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter name");
				sname=sc.next();
				
				System.out.println("Enter id");
				sid=sc.nextInt();
				String driver="com.mysql.cj.jdbc.Driver";
				String url="jdbc:mysql://localhost:3306/mydb";//mydb is database name
				String un="root";
				String pa="root";
				
				try {
					//load the driver
					Class.forName(driver);
					Connection conn=DriverManager.getConnection(url,un,pa);
					Statement st=conn.createStatement();
				     
					String ins="insert into student values("+sid+",'"+sname+"')";
					int i=st.executeUpdate(ins);
					if(i>0) {
						System.out.println("Record inserted");
					}else {
						System.out.println("Not inserted");
					}
				
			     }catch(Exception e) {
					e.printStackTrace();
				}
	}

}
