package javaTutorials;

import java.util.HashMap;

public class day33hashmap {

	public static void main(String[] args) {
		HashMap<String ,Integer> students = new HashMap<>();
		
		students.put("satya", 35);
		students.put("madhu", 40);
		students.put("koshika",7);
		students.put("jathin", 4);
		students.put("jaya", 10);
		System.out.println(students);
		
		// Accessing the value from HashMap()
		int a = students.get("satya");
		System.out.println(a);
		
		// check particular key exists
		boolean b = students.containsKey("jathin");
		System.out.println(b);
		
		// total number of key value in HashMap
		int c = students.size();
		System.out.println(c);
		
		// remove the value
		students.remove("satya");
		System.out.println(students);
		
		// update the value
		
		students.put("koshika", 8);
		System.out.println(students);
		
		// looping through HashMap
		
		System.out.println(students.values());
		System.out.println(students.keySet());
		
		// loop over it using above method
		
		for(String key : students.keySet()) {
			System.out.println(key);
		}
		
		for(int value : students.values()) {
			System.out.println(value);
		}
		
		
	}

}
