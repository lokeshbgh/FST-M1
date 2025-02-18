package activities;

import java.util.Arrays;


public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {9, 5, 1, 4, 3};
		System.out.println("Array details Before sorting :" + Arrays.toString(data));
		ascendingSort(data);
		System.out.println("Array details After sorting :" + Arrays.toString(data));
		
	}

	static void ascendingSort(int array[]) {
			int size = array.length, i;
			//System.out.println("Array Size is " + size);
			//System.out.println("Array Length is " + array.length);
			
			
		for (i=1; i < size; i++) {
			int key = array[i];
			int j = i - 1; 
			
			while (j >= 0 && key < array[j]) {
				array[j+1] = array[j];
				--j;
		
			}
			array[j + 1] = key;
		}
		
	}

}
