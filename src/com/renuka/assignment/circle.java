package com.renuka.assignment;
import java.util.Scanner;
public class circle 
{
    String colour;
    double radius;
    Scanner c=new Scanner(System.in);
    
    	public void getinput()
    	
    	{
    		System.out.println("Enter colour:");
    		String colour=c.nextLine();
    		System.out.println("Enter radius:");
    		float radius=c.nextFloat();
    		c.close();
    		
    	}
    	public void calculatearea()
    	{
    		
             double area=Math.PI*radius*radius;
             System.out.println("Area of the circle is:"+area);
            
    	}
    	public static void main(String[]args)
    	{
    		circle r=new circle();
    	    r.getinput();
    		r.calculatearea();
    		
    		
    		
    	}
   
	
	

}