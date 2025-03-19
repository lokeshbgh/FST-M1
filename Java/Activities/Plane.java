package fsthello;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
	private int maxPassengers;
	private List<String> Passengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;
    
	public Plane(int num) {
		this.maxPassengers = num;
		this.Passengers = new ArrayList<>();
	}
		
	public void onboard(String[] names){
		int i;
		for (i=0; i < names.length; ++i) {
			if (i >= this.maxPassengers) {
				break;
			} else {
				this.Passengers.add(names[i]);
				System.out.println("people onboard: " + i + " " + this.Passengers);
			}
			
		}
		System.out.println("\ntotal people onboard: " + i);
		//System.out.println("list of people onboard: " + this.Passengers);
		
	}
	
	public List<String> getPassengers(){
		return this.Passengers;
	}
	
	public Date takeOff(){
		this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
	}
	
	public void land(){
		this.lastTimeLanded = new Date();
        this.Passengers.clear();
	}
	
	public Date getLastTimeLanded(){
		return this.lastTimeLanded;
	}
	
	
}
