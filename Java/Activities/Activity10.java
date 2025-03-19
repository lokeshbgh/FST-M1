package session3;

import java.util.HashSet;

public class Activity10 {
	public static void main(String[] arg) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		hs.add(3);
		
		System.out.println("objects of Hashset - " + hs);
		System.out.println("size of Hashset - " + hs.size());
		
		//hs.remove(1);
		System.out.println("Removing A from HashSet: " + hs.remove(1));
		System.out.println("objects of Hashset - " + hs);
		System.out.println("size of Hashset - " + hs.size());
		
		System.out.println("remove objects which is not present in Hashset");
		//hs.remove(1);
		System.out.println("Removing A from HashSet: " + hs.remove(1));
		
		 if(hs.remove(1)) {
	       	System.out.println("1 removed from the Set");
	     } else {
	       	System.out.println("1 is not present in the Set");
	     }
		  
		System.out.println("objects of Hashset - " + hs);
		System.out.println("size of Hashset - " + hs.size());
		
		if(hs.contains(3)) {
			System.out.println("objects present in Hashset");
		} else {
			System.out.println("objects does not present in Hashset");
		}
		
		if(hs.contains(1)) {
			System.out.println("objects present in Hashset");
		} else {
			System.out.println("objects does not present in Hashset");
		}
	}
}
