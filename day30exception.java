package javaTutorials;

public class day30exception {

	public static void main(String[] args) {
	
		// program 1
		
		System.out.println("hello");
		System.out.println(5/5);
		System.out.println("bye");
		
		// program2
		
		System.out.println("hello");
		try {
			int dividebyzero = 5/0;
			System.out.println("rest of code in try block");
		}
		catch(ArithmeticException e) {
			
			System.out.println(e.getMessage());
		}
		System.out.println("bye");
		
		
		
		// program 3
		
		System.out.println("Define a array with values");
		int [] numbers = {1,2,3,4};
		try {
			System.out.println(numbers[0]);
			System.out.println(numbers[5]);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("moving ahead after managing the exception");
		
		// program 4
		
		System.out.println("Define a array with values");
		
		try {
			int [] numbers2 = {1,2,3,4};
			System.out.println(numbers2[5]);
			System.out.println(4/0);	
		}
		catch(ArithmeticException e) {
			System.out.println("please enter valid input");
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("please enter a valid index for array");
			System.out.println(e.getMessage());
			
		}
		catch(Exception e) {
			System.out.println("Exception handled successfully");
		}
		System.out.println("moving ahead after managing the exception");
		
			// program 5
		
		System.out.println("hello");
		try {
			System.out.println(5/0);
		}
		catch(Exception e) {
			System.out.println("Exception managed successfully");
			String msg = e.getMessage();
			System.out.println(msg);
				
		}
		finally {
			System.out.println("i will be executed anyhow");
		}
		
		

	}

}
