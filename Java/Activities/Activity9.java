package session3;

import java.util.ArrayList;

public class Activity9 {
	public static void main(String[] arg) {
		ArrayList<String> myList = new ArrayList<String>();
		
		myList.add("Apple");
        myList.add("Mango");
        myList.add("Orange");
        //Adding object at specific index
        myList.add(3, "Grapes");
        myList.add(1, "Papaya");
        
        System.out.println("Print All the Objects:");
		for(String name : myList) {
			System.out.println(name);
		}
		
		if (myList.contains("a4")) {
			System.out.println("name exist in array list");
		} else {
			System.out.println("name doesn't exist in array list");
		}
		
		System.out.println("size of array list - " + myList.size());
		
		myList.remove("Papaya");
		System.out.println("size of array list - " + myList.size());
		
		System.out.println("Print All the Objects:");
		for(String name : myList) {
			System.out.println(name);
		}
	}
}
