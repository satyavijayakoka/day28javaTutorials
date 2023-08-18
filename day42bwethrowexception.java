package javaTutorials;

class MyException extends Exception{
	public MyException(String s) {
		
		// call constructor of parent Exception
		super(s);
	}
}

class InvalidMobileNumber extends Exception{
	public InvalidMobileNumber(String s) {
		
		// call constructor of parent Exception
				super(s);
	}
}

// a class that uses above MyException

public class day42bwethrowexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String password = "cmdsjjygjhnl";
			if(password.length() <= 10) {
				throw new MyException("password length is small"); 
			}
			String mobile = "sdfgetnhj";
			if(mobile.length() <= 10) {
				throw new InvalidMobileNumber ("please enter correct mobile");
			}
			System.out.println("user registered");
		}
		catch(Exception e) {
			System.out.println("function called");
			System.out.println("caught");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
			
			
		}
		
	}

}
