package session4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//In this activity, accept number inputs from the console using Scanner class and store them in an array.
//Then use the Random class to generate an index value and print the value in the array at then generated index value.
public class Activity13 
{
	public static void main( String args[] ) 
	{
		ArrayList<Integer> list = new ArrayList <Integer>();
		
		Scanner scan = new Scanner(System.in);
		Random indexGen = new Random();
		
		System.out.print("Enter integers input - (non-integer to terminate): ");
 
        while(scan.hasNextInt()) {
            list.add(scan.nextInt());
        }
 
        System.out.println("list data - " + list);
               
        for(int n : list)
        {
        	System.out.println("nums: " + n);
        }
        
        System.out.println("nums length: " + list.size());
        int index = indexGen.nextInt(list.size());
        
        System.out.println("Index value generated: " + index);
        System.out.println("Value in arary at generated index: " + list.get(index));
 
        
        //Integer nums[] = list.toArray(new Integer[0]);
        //System.out.println("nums length: " + nums.length);
        //int index = indexGen.nextInt(nums.length);
        //System.out.println("Index value generated: " + index);
        //System.out.println("Value in arary at generated index: " + nums[index]);
        
        scan.close();
    }	
}



