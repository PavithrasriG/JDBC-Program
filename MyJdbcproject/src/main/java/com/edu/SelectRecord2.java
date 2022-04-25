package com.edu;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectRecord2 {

	public static void main(String[] args) {
		
		
				//Connection 
						String driver="com.mysql.cj.jdbc.Driver";
						String url="jdbc:mysql://localhost:3306/mydb"; //mydb is the database name of mysql
						String un="root";
						String pass="root";
						Connection conn=null;
						Statement st=null;
						ResultSet rs=null;
						try {
							Class.forName(driver);
							conn = DriverManager.getConnection(url,un,pass);
							st=conn.createStatement();
							
							String sql="select * from edustudent1";
							rs=st.executeQuery(sql);
							System.out.println("Name\t\tEmail\t\t\tPass\t\t\tAge");
							while(rs.next()) {
								String n=rs.getString(1);
								String e=rs.getString(2);
								String p=rs.getString(3);
								int a=rs.getInt(4);
							System.out.println(n+"\t\t"+e+"\t\t\t"+p+"\t\t\t"+a);
							}
						}catch(Exception e) {
							e.printStackTrace();
						}
					}

		}
	