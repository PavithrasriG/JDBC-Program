package edu.studentdb;

import java.util.Scanner;

//Using PreparedStatement
//MainApp.java

public class MainClass {

	public static void main(String[] args) {
		
		
		//Menu from user
		
		Scanner sc=new Scanner(System.in);
		// student database display
		while(true) {
		System.out.println("Database operations");
		System.out.println("Enter your choice");
		System.out.println("1.To display Student information");  // all the record will be display
		System.out.println("2.Insert Student record");       // insert the record
		System.out.println("3.Update Student information based on id"); // update particular id
		System.out.println("4.Delete Student information based on id"); // delete particular id
		System.out.println("5.Select Student based on ID");   // particular id give the input 
		                                                     //particular id details is display
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1: StudentDataBaseOperations.displayRecords();
		        break;
		case 2: StudentDataBaseOperations.addRecords();
		        break;
		case 3: StudentDataBaseOperations.updateRecords();
		        break;
	    case 4:	StudentDataBaseOperations.deleteRecords();
	            break;
	    case 5: StudentDataBaseOperations.selectStudentId();
	            break;
		 
		default:System.out.println("Invalid choice");
		} //switch
		
		System.out.println("Do you want to continue yes/no");
		String choice=sc.next();
		if(choice.equalsIgnoreCase("no")) {
			break;
		} //if
		
		}//while end
		System.out.println("Program Terminated");
	} //main

}//MainApp

		
		
