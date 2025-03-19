package fsthello;

public class MountainBike extends Bicycle {
	public int seatHeight;
	
	public MountainBike (int gear, int speed, int sheight) {
		super(gear, speed);
		
		this.seatHeight = sheight;
		
	}
	
	public MountainBike (int sheight) {
		this.seatHeight = sheight;
		
	}
	
	public void setHeight(int newValue) {
	    seatHeight = newValue;
	}
	
	public String bicycleDesc() {
        return (super.bicycleDescribe()+ "\nSeat height is " + seatHeight);
    }

}
