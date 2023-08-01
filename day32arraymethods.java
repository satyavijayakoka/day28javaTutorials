package javaTutorials;

import java.util.ArrayList;

public class day32arraymethods {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		// add()
		boolean a = names.add("satya");
		System.out.println(a);
		names.add("madhu");
		names.add("koshika");
		names.add("jathin");
		System.out.println(names);
		
		// add (position , element)
		
		names.add(2, "jaya");
		System.out.println(names);
		
		// remove
		
		//   0      1      2      3        4
		// [satya, madhu, jaya, koshika, jathin]
		names.remove(0);
		System.out.println(names);
		names.remove("jaya");
		System.out.println(names);
		
		// clear()
		
		names.clear();
		System.out.println(names);
		names.add("shiva");
		names.add("santosh");
		names.add("chinnu");
		names.add("kushal");
		names.add("jagan");
		System.out.println(names);
		
		//    0      1          2     3       4
		// [shiva, santosh, chinnu, kushal, jagan]
		// set()
		
		names.set(0, "neelima");
		System.out.println(names);
		
		// contains()
		
		boolean q1 = names.contains("santosh");
		System.out.println(q1);
		
		// [neelima, santosh, chinnu, kushal, jagan]
		
		// get()
		
		String eleAtIndex2 = names.get(2);
		System.out.println(eleAtIndex2);
		
		// index of
		
		int num = names.indexOf("kushal");
		System.out.println(num);
		
		int numB = names.indexOf("Kushal");
		System.out.println(numB);
		
		
		ArrayList<String> fruits  = new ArrayList<>();
		
		fruits.add("guava");
		fruits.add("orange");
		fruits.add("grapes");
		fruits.add("kiwi");
		System.out.println(fruits);
		
		String userInput = "guava";
		if(fruits.contains(userInput)) {
			System.out.println("element available");
			
		}
		else {
			System.out.println("element not available");
		}
		
		// indexOf()
		
		if(fruits.indexOf("guava")>=0) {
			System.out.println("element available");
		}
		else {
			System.out.println("element not available");
		}
		
		 ArrayList<String> cities = new ArrayList<>();
		
		cities.add("hyderabad");
		cities.add("vijayawada");
		cities.add("tirupathi");
		cities.add("nellore");
		cities.add("hyderabad");
		
		System.out.println(cities.size());
		System.out.println(cities);
		
		// [hyderabad, vijayawada, tirupathi, nellore, hyderabad]
		
		System.out.println(cities.indexOf("hyderabad"));
		System.out.println(cities.lastIndexOf("hyderabad"));
		
		

	}

}
