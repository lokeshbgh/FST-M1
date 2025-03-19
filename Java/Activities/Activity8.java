package session3;

public class Activity8 {
	public static void main(String[] arg) {
		
		try{
			exceptionTest("Will print to console");
			exceptionTest(null);
			exceptionTest("Won't execute");
		} catch (CustomException e) {
			System.out.println("message is " + e.getMessage());
		}
		
	}
	
	static void exceptionTest(String msg) throws CustomException {
		if (msg == null) {
			throw new CustomException(msg);
		}
		else {
			System.out.println(msg);
		}	
		
	}

}
