package com.renuka.problemstatement;

public class bicycle {

	int gears;
	int speed;
	
	
		public bicycle()
		
		{
			System.out.println("default constructor of bicycle");
			gears=50;
			speed=40;
		}


		public bicycle(int gears, int speed) {
			
			this.gears = gears;
			this.speed = speed;
		}


		public int getGears() {
			return gears;
		}


		public void setGears(int gears) {
			this.gears = gears;
		}


		public int getSpeed() {
			return speed;
		}


		public void setSpeed(int speed) {
			this.speed = speed;
		}


		@Override
		public String toString() {
			return "bicycle [gears=" + gears + ", speed=" + speed + "]";
		}


		
		
}
