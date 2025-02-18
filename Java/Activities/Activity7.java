package activities;


interface BicycleParts {
	public int tyres=2;
	public int maxSpeed=25;
}

interface BicycleOperations {
	public void applyBreak(int decrement);
	public void speedUp (int increment);
}

class Bicycle implements BicycleParts, BicycleOperations {
		public int gears;
		public int currentSpeed;
		
		public Bicycle(int gears, int currentSpeed){
			this.gears = gears;
			this.currentSpeed = currentSpeed;
		}

		public void applyBreak(int decrement) {
			currentSpeed -= decrement; 
			System.out.println("Current speed is: " +currentSpeed);
		}
		
		public void speedUp(int increment) {
			currentSpeed += increment;
			System.out.println("Current Speed is : " +currentSpeed);
		}
		
		
		public String bicycleDesc(){
			return ("Total Number of Gears is: " + gears + " Max Speed is: " + maxSpeed);
			
		}
	}


class MountainBike extends Bicycle {
	public int seatHeight ;
	public MountainBike(int gears, int currentSpeed, int startHeight){
		super (gears, currentSpeed);
		seatHeight = startHeight;
		
	}
	
	public void setHeight (int newValue) {
		seatHeight = newValue;
	}
	
	public String bicycleDesc() {
		return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
	}

}

public class Activity7 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		MountainBike mb = new MountainBike(4, 10, 20);
		System.out.println(mb.bicycleDesc());
		mb.speedUp(20);
		mb.applyBreak(5);
	}
}

