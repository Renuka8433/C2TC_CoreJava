package com.renuka.assignment;
import java.util.Scanner;
public class commission {
	Scanner s=new Scanner(System.in);
	String name,address;
	int salesamount;
	long rollno;
	
	public void employeedetails()
	
	
	{
		
		System.out.println("Enter your name:");
		String name=s.nextLine();
		System.out.println("Enter your address:");
		String address=s.nextLine();
		System.out.println("Enter your phoneno:");
	    long rollno=s.nextLong();
	    System.out.println("Enter your salesamount:");
	    int salesamount=s.nextInt();
	    System.out.println("view details:");
	}
	public void calculatecommision() 
	{
	
		if(salesamount>=100000)
		{
			System.out.println("commision=10%");
	    }
		else if(50000<=salesamount&&salesamount<100000) 
		{
			System.out.println("commision=5%");
		}
		else if(30000<=salesamount&&salesamount<50000)
		{
			System.out.println("commision=3%");
		}
		else
		{
			System.out.print("no commision");
		}
	}
	public static void main(String[]args)
	{
		commission c=new commission();
		c.employeedetails();
		{
			System.out.println("student object created");
		}
		c.calculatecommision();
		
	}
}
	
	
		
		
		
	
	
		   
	


