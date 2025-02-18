package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {

	private List<String> passengers;
	private int maxPassengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;
    
	public Plane(int maxPassengers){
    	this.maxPassengers = maxPassengers;
    	this.passengers = new ArrayList<>();
    }
    
    public void onboard(String passenger){
    	this.passengers.add(passenger);    	
    }
    
    public Date takeOff(){
    	this.lastTimeTookOf = new Date();
    	return lastTimeTookOf;
    }
    
    public void land(){
    	this.lastTimeLanded = new Date();
    	this.passengers.clear();
    }
    
    public Date getLastTimeLanded(){
    	return lastTimeLanded;
    }
    
    public List<String> getPassengers(){
    	return passengers;
    }
}

public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane plane = new Plane(10);
		plane.onboard("Lokesh");
		plane.onboard("Rakesh");
		System.out.println("Plane took off at: " + plane.takeOff());
		System.out.println("People on the plane: " + plane.getPassengers());
		plane.land();
		System.out.println("Plane Landed at : " + plane.getLastTimeLanded());
		System.out.println("People on the plane after landing: " + plane.getPassengers());

	}

}
