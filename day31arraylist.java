package javaTutorials;

import java.util.ArrayList;

public class day31arraylist {

	public static void main(String[] args) {
		// collection
		ArrayList<String> language = new ArrayList<>();
		
		//[java,  python,  javascript,  selenium]
		
		language.add("java");
		language.add("python");
		language.add("javascript");
		language.add("selenium");
		System.out.println(language);
		
		// retrive
		
		String a = language.get(0);
		String b = language.get(1);
		String c = language.get(2);
		String d = language.get(3);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		for(int i = 0; i < language.size(); i++) {
			// System.out.println(i);
			System.out.println(language.get(i));
				
		}
		// update value of arraylist
		
		ArrayList<String> animals= new ArrayList<>();
		animals.add("dog");
		animals.add("cat");
		animals.add("rabbit");
		animals.add("duck");
		
		System.out.println(animals);
		
		animals.set(1, "lion");
		System.out.println(animals);
		
		
		animals.remove(2);
		System.out.println(animals);
		
		
		// Defining  the arrayList 
				// Adding the value to arrayList 
				// Updating the value from arrayList
				// Deleting the value from arrayList
				
				
				// ArrayList ------> int 
				// ArrayList ------> string 
				// ArrayList ------> boolean 
				// ArrayLIst ------> person
				
				
		
	
	}

}
