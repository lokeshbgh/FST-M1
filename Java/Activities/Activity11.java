package session3;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
	public static void main(String[] arg) {
	
		Map<Integer, String> colours = new HashMap<Integer, String>();
		
		colours.put(1, "red");
		colours.put(2, "pink");
		colours.put(3, "blue");
		colours.put(4, "orange");
		colours.put(5, "green");
		colours.put(1, "red");
		colours.put(6, "red");
		
		System.out.println("data in colour map - " + colours);
		System.out.println("size of colour map - " + colours.size());
		
		System.out.println("removed colour from map - " + colours.remove(2));
		
		System.out.println("data in colour map - " + colours);
		System.out.println("size of colour map - " + colours.size());
		
		if(colours.containsValue("green")) {
			System.out.println("green present in colour map");
		} else {
			System.out.println("green not present in colour map");
		}
		
	}
}
