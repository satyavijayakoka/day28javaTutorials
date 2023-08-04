package javaTutorials;

import java.util.HashMap;
import java.util.Map;

public class day34bmapwithhashmaP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// program 1
		Map<String, String> course = new HashMap<String, String>();
		course.put("course", "javascript");
		course.put("courseone", "selenium");
		course.put("coursetwo", "python");
		course.put("coursethree", "java");
		System.out.println(course);
		
		
		for(Map.Entry<String, String> entry : course.entrySet()) {
			System.out.println(entry.getKey()+entry.getValue());
			
		}
		
		// program 2 
		
		Map<String, String> students = new HashMap<String, String>();
		students.put("firstName", "satya");
		students.put("lastName", "koka");
		students.put("rollNo", "8");
		students.put("age", "35");
		students.put("skills", "cooking");
		System.out.println(students);
		
		for(String prop : students.keySet()) {
			System.out.println(prop);
		}
		
		for(String prop : students.values()) {
			System.out.println(prop);
		}
		
		Map<String, String> vehicle = new HashMap<String, String>();
	       vehicle.put("color", "blue");
	       vehicle.put("type", "suv");
	       vehicle.put("company", "honda");
	       System.out.println(vehicle);
	       
	       System.out.println(vehicle.get("color"));
	       
	       for(String key : vehicle.keySet()) {
	    	   System.out.println(key);
	    	   System.out.println(vehicle.get(key));
	       }
		

	}

}
