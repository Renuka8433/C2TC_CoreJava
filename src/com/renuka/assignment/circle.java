package com.renuka.assignment;
import java.util.Scanner;
public class circle 
{
    String colour;
    float radius;
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
    		
             float area=3.14f*radius*radius;
            
    	}
    	public static void main(String[]args)
    	{
    		circle r=new circle();
    	    r.getinput();
    		r.calculatearea();
    		
    		System.out.println("Area of the circle is:");
    		
    	}
   
	
	

}