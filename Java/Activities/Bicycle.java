package fsthello;

public class Bicycle implements BicycleParts, BicycleOperations{
	
	public int gears=0;
    public int cSpeed=0;
    
	public Bicycle(int igear, int ispeed) {
		this.gears = igear;
		this.cSpeed = ispeed;
	}
	
	public Bicycle() {
		this.gears = 0;
		this.cSpeed = 0;
	}
	
	public void applyBrake(int decrement) {
		cSpeed -= decrement;
        System.out.println("Current speed after applyBrake : " + cSpeed);
    }

    public void speedUp(int increment) {
    	cSpeed += increment;
        System.out.println("Current speed after speedUp : " + cSpeed);
    }
    
	public String bicycleDescribe() {
	    return("No of gears are "+ this.gears + "\nSpeed of bicycle is " + this.cSpeed);
	}
}


