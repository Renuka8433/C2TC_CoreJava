package com.renuka.problemstatement;

public class montanebike extends bicycle {
	int seathight;
	
	public montanebike()
	{
		System.out.println("default construtor of monotanebike");
		seathight=70;
	}

	public montanebike(int seathight) {
	
		this.seathight = seathight;
	}

	public int getSeathight() {
		return seathight;
	}

	public void setSeathight(int seathight) {
		this.seathight = seathight;
	}

	@Override
	public String toString() {
		return "montanebike [seathight=" + seathight + ", gears=" + gears + ", speed=" + speed + "]";
	}
	

}
