package activities;

public class Activity2 {
	public static void main(String[] args) {
		// create object for the class
		Activity2 actObj = new Activity2();

		// Create the integer array
		int[] nums = { 10, 77, 10, 54, -11, 10 };

		// set the number to search for
		int searchNum = 10;
		int fixedSum = 30;

		System.out.println("Result: " + actObj.result(nums, searchNum, fixedSum));

	}

	public boolean result(int[] nums, int searchNum, int fixedSum) {
		// temp variable to hold the calculated sum
		int tempSum=0;

		// loop through the array to calculate the sum
		for (int number : nums) {
			// Check if the value is searchNum
			if (number == searchNum) {
				// add the value
				tempSum += searchNum;
			}
				// check if tempSum is greater than fixedSum
				if (tempSum > fixedSum) {
					// condition fails; break loop
					break;
				}
			}
        //Return true if condition satisfies
		return tempSum == fixedSum;
		}
	 

}
