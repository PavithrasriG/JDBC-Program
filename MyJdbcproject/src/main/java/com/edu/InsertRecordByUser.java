package com.edu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;


public class InsertRecordByUser {
	public static void main(String[] args) {
		//Connection 
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/mydb"; //mydb is the database name of mysql
		String un="root";
		String pass="root";
		Connection conn=null;
		Statement st=null;
		String username=null;
		int userid=0;
		Scanner sc=new Scanner(System.in);
		String ins=null;
		try {
			Class.forName(driver); //load the driver  , here Class is the name of class
		    conn=DriverManager.getConnection(url, un, pass);
		    st=conn.createStatement();
		    
		    //from here
		    while(true) {
		    System.out.println("Enter name");
		    username=sc.next();
		    System.out.println("Enter id");
		    userid=sc.nextInt();
		    ins="insert into login2 values("+userid+",'"+username+"')";
		    int i=st.executeUpdate(ins);   // inserting is update
		    if(i>0) {
		    	System.out.println("Record is inserted successfully");
		    }else {
		    	System.out.println("Not inserted");
		    }
		    
		    System.out.println("Do you want to continue y/n"); // again insert the login2 table name
		    char ch=sc.next().charAt(0);
		    if(ch=='n') {
		    	break;
		    }
		    }
		    
		}catch(Exception e) {
			e.printStackTrace();
		}
      System.out.println("End of the program");
	}
}
