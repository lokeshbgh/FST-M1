package session4;

//In this activity, we will be creating a functional interface and use it with a lambda expression
//for lambda expression interface should have only 1 method
interface Addable 
{
	int add1(int arg1, int arg2);
}

interface testAddable 
{
	int test();
}

public class Activity12 
{
	public static void main (String[] arg)
	{
		// Lambda expression to implement the interface method
		Addable ad1 = (int arg1, int arg2) -> {
			return arg1+arg2;
		};
		
		System.out.println("lambda function(has a body) - " + ad1.add1(2, 3));
		
		Addable ad2 = (int arg1, int arg2) -> (arg1+arg2);
			
		System.out.println("lambda expression(no body) - " + ad2.add1(12, 13));
		
		
		testAddable ad3 = () -> {
			return 15;
		};
		System.out.println(ad3.test());
		
		testAddable ad4 = () -> (15);
		System.out.println(ad4.test());
	
	}
	
}
