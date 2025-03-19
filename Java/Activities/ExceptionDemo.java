package session3;

public class ExceptionDemo { 
	public static void main(String[] arg) {
		//example 1
		try {
			int[] nums = {1,2,3,4};
			System.out.println(nums[8]);
		}
		catch (Exception e) {
			//to print exception message from throw exception
			System.out.println("example 1 - " + e.getMessage());
		}
		finally {
			System.out.println("this is finally!");
		}
		
		//example 2
		try {
			throw new Exception("this is custom error message");
			
		}
		catch (Exception e) {
			//to print exception message from throw exception
			System.out.println("example 2 - " + e.getMessage());
		}
		
		//example 3
		try {
			exceptionmethod();
						
		}
		catch (Exception e) {
			//to print exception message from throw exception
			System.out.println("example 3 - " + e.getMessage());
		}
		
		System.out.println("this is after the error!");
		
	}
	
	public static void exceptionmethod() throws Exception {
		
		try {
			throw new Exception("this is custom error message");
			
		}
		catch (Exception e) {
			//to print exception message from throw exception
			System.out.println("exceptionmethod - " + e.getMessage());
		}
		
		//not handle the exception but it throws to calling method to handle
		throw new Exception("this is exceptionmethod custom error message");
	}

}
