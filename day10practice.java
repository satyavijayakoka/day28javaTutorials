package javaTutorials;

public class day10practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// program 1
		String city = "pune";
		
		// 0 1 2 3 
		// p u n e
		
		for(int i = 0; i < city.length(); i++) {
			System.out.println(city.charAt(i));
			
		}
		// program 2
		
		for(int i = city.length()-1; i >= 0; i--) {
			System.out.println(city.charAt(i));
		}
		// program 3
		
		String city2 = "Nagpur";
		String upperCaseString = city2.toUpperCase();
		System.out.println(upperCaseString);
		
	// Program4
		
	String city3 = "WARdha";
	String lowerCaseString = city3.toLowerCase();
	System.out.println(lowerCaseString);
	}
	
		}
