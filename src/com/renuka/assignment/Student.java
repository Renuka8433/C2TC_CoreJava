package com.renuka.assignment;
import java.util.Scanner;
public class Student {
	public static void main(String[]args)
	
	{
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=s.nextLine();
		System.out.println("Enter your initial:");
		char initial=s.next().charAt(0);
		System.out.println("Enter your rollno:");
	    long rollno=s.nextLong();
	    System.out.println("Enter your grade:");
	    char grade=s.next().charAt(0);
	    System.out.println("Enter your percentage:");
	    float percentage=s.nextFloat();
	    System.out.println("view details:");
	    
	    
	    
	    System.out.print(" name:"+name);
	    System.out.println("."+initial);
	    System.out.println(" rollno:"+rollno);
	    System.out.println(" grade:"+grade);
	    System.out.println(" percentage:"+percentage);
	    
	    
	    
	    
		
	}

}
