package edu.com.student;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	
		//Database Connection information
		
		 static String driver="com.mysql.cj.jdbc.Driver";
		 static String url="jdbc:mysql://localhost:3306/mydb";
		 static String un="root";
		 static String pass="root";
		 static Connection conn=null;
		 
		 public static Connection getConnection() {
			 try {
				 Class.forName(driver);
				 conn=DriverManager.getConnection(url, un, pass);
				 if(conn==null) {
					 System.out.println("Error in connection");
				 }//if
			 }//try
			 catch(Exception e) {
				 e.printStackTrace();
			 }//catch
			 return conn;
			}//getconnection
		 }//dbconnect
	


