package javaTutorials;

public class day12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// program1
		//  0  1  2  3  4  5  6  7  8  9  10  11  12  
		//  v  i  s  a  k  h  a  p  a  t  n    a   m
		String city = "VisaKHapatnam";
		 String uc = city.toUpperCase();
		System.out.println(uc);
		System.out.println(city.toUpperCase());
		System.out.println("wELcome".toUpperCase() + uc);
		
		String lc = city.toLowerCase();
		System.out.println(lc);
		System.out.println(city.toLowerCase());
		System.out.println("WElcome".toLowerCase() + lc);
		
	// program2
		String city2 = "NeLLore";
		    int a = city2.length();	
		    System.out.println(a);
		    
		int b = city2.toUpperCase().toLowerCase().length();
		System.out.println(b);
		
		// program3
		 
		    //  0  1  2  3  4  5  6  7  8  9  
		
		    //  S  r  i  k  a  k  u  l  a  m
		
		String city3 = "Srikakulam";
		  char c  = city3.charAt(city3.length()-1);
		  System.out.println(c);
		  
		  // program 4
		  
	//  0  1  2  3   4   5   6  7  8   9
    //  B  h  i  m   a   v   a  r  a   m
		  String city4 = "Bhimavaram";
		   String s1 = city4.substring(3);
		System.out.println(s1);
	
		String s2 = city4.substring(2, 5);
		System.out.println(s2);
		
	}

	}
