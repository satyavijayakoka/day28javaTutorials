package javaTutorials;

public class day13practicemethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// starts with()
		String name = "Elephant";
  boolean s1 = name.startsWith("El");
    System.out.println(s1);
    
    // ends with()
    String name2 = "Gorilla";
boolean s2 = name2.endsWith("lla");
		System.out.println(s2);
		
		// replace First()
		String name3 = "I love dogs and dogs are cute ";
		String s3 = name3.replaceFirst("dogs"," parrots");
		System.out.println(s3);
		
	// replace All()
		String s4 = name3.replaceAll("dogs", "parrots");
		System.out.println(s4);
		
		// replace()
		String s5 = name3.replace("I", "U");
		System.out.println(s5);
		
	// concat()
		String name4 = "Lizard";
		String name5 = "I hate ";
		String s6 = name5.concat(name4);
		System.out.println(s6);
		
	// contains()
		String name6 = "I love India";
		String name7 = "love";
		boolean s7 = name6.contains(name7);
		System.out.println(s7);
		
		String name8 = "I am learning java";
		String name9 = "JAVA";
		boolean s8 = name8.toUpperCase().contains(name9);
		System.out.println(s8);
		
		
	// equal()
		String name10 = "Erie";
		String name11 = "ERIE";
		boolean s9 = name10.equals(name11);
		System.out.println(s9);
		
	// equals ignore case()
		boolean s10 = name10.equalsIgnoreCase(name11);
		System.out.println(s10);
		
		// trim()
		String name12 = " I enjoy cooking ";
		System.out.println(name12.length());
		
		String s11 = name12.trim();
		System.out.println(s11.length());
		
		
	}

}
