package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecord {

	public static void main(String[] args) {
		
		//based on id fetch the record
		//Connection 
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/mydb"; //mydb is the database name of mysql
		String un="root";
		String pass="root";
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id to delete record");
		int userid = sc.nextInt();
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,un,pass);
			st=conn.createStatement();
		  String sql="select * from login2 where userid="+userid; //get only one row
		  //check id exists
		  rs=st.executeQuery(sql);
		  if(rs.next()) { //if true record exists
			//delete operation when record exists
			  
				String del = "delete from login2 where userid="+userid;
				int  i=st.executeUpdate(del);
				
				if(i>0) {
					System.out.println("Record is deleted");
				}//if(i>0)
				}//if(rs.next)
			  else {
				  System.out.println("Record not exists");
			  }//else
			  
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}

}

}
		  
	
