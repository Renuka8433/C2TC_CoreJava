package com.tnsif.daythree;

import java.util.Scanner;

public class persondemo {
	public static void main(String[]args)
	{
		person P1=new person();
		Scanner s=new Scanner (System.in);
		String name,gender;
		int income;
		System.out.println("enter person details:name,income,city");
		name=s.nextLine();
		income=s.nextInt();
		gender=s.nextLine();
		P1.setname(name);
		P1.setincome(income);
		P1.setgender(gender);
		
		System.out.println("Person details:"+p1.getPersonname()+"income:"+p1.getPersonage()+"city:"+p1.getpersongender());
	}

}
