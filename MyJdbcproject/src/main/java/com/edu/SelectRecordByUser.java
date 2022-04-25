package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectRecordByUser {

public static void main(String[] args) {
				//Connection 
	            //based on all the record id display
						String driver="com.mysql.cj.jdbc.Driver";
						String url="jdbc:mysql://localhost:3306/mydb"; //mydb is the database name of mysql
						String un="root";
						String pass="root";
						Connection conn=null;
						Statement st=null;
						ResultSet rs=null;   // all the record will be fetch
						try {
							Class.forName(driver);
							conn = DriverManager.getConnection(url,un,pass);
							st=conn.createStatement();
							
							String sql="select * from login2";
							rs=st.executeQuery(sql);   // exceute
							System.out.println("USERID\tUSERNAME");
							while(rs.next()) {
								int userid=rs.getInt(1);  // rs.getInt("id");
								String username=rs.getString(2); // rs.getString("name");
								System.out.println(userid+"\t"+username);
							}
						}catch(Exception e) {
							e.printStackTrace();
						}
							
						
			}

		}

	