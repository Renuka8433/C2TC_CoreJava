package com.tnsif.daythree;

public class customer {

	private String cutomername;
	int customerid;
	private String customercity;
	
	
	public customer()
	
	{
		System.out.println("default constructor");
	}


	public customer(String cutomername, int customerid, String customercity) {
		super();
		this.cutomername = cutomername;
		this.customerid = customerid;
		this.customercity = customercity;
	}
}
