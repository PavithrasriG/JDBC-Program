package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class CreateTable {

	public static void main(String[] args) {
		
			String mytable="create table cloudemp(cid int(4) primary key,cname varchar(20) not null)";
		   //connection code
			
			String driver="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/mydb";
			String un="root";
			String pa="root";
			
			try {
				Class.forName(driver);
				Connection conn=DriverManager.getConnection(url,un,pa);
				Statement st=conn.createStatement();
				st.execute(mytable);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			}
		
	}



