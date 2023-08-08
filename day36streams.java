package javaTutorials;

import java.util.Arrays;
import java.util.List;

public class day36streams {

	public static void main(String[] args) {
		
		// stream--> API testing
		
		// count of blank string
		
		List<String> names = Arrays.asList("satya", "", "madhu","","shiva", "jagan");

		System.out.println(names.stream().filter(x-> x.isEmpty()).count());
		
		// taking the blank string to list
		List<String> names2 = Arrays.asList("satya", "", "madhu","","shiva", "jagan");
		
		System.out.println(names2.stream().filter(x-> x.isEmpty()).toList());
		
		// only the string
		
		List<String> names3 = Arrays.asList("satya", "", "madhu","","shiva", "jagan");
		System.out.println(names3.stream().filter(x-> ! x.isEmpty()).toList());
		
		
		// names starts with s
		List<String> names4 = Arrays.asList("satya", "", "madhu","","shiva", "jagan");
		System.out.println(names4.stream().filter(x-> x.startsWith("s")).toList());
		
		
		// string greater than 4
		
		List<String> names5 = Arrays.asList("satya", "", "madhu","","shiva", "jagan");
		System.out.println(names5.stream().filter(x-> x.length()>4).toList());
		
		
		// Working with every element of string 
				// ["satya","madhu","shiva"] ===> //["SATYA","MADHU","SHIVA"]
				
		
		List<Integer> numbers = Arrays.asList(100,-1900,78888,-900,-4523,98);
		
		System.out.println(numbers.stream().filter(x-> x>0).toList());
		System.out.println(numbers.stream().filter(x-> x<0).toList());
		
		// Convert every list in map to Upper case()
		
				List<String> countries =Arrays.asList("USA","China","america","Africa","London");
		
		System.out.println(countries.stream().map(x-> x.toUpperCase()).toList());
		
		List<Integer> numbers1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(numbers1.stream().map(x-> x*2).toList());
		
		List<Integer> salary = Arrays.asList(6000,6000,6500,56777,9000);
		System.out.println(salary.stream().map(x-> x+x*0.10).toList());
		
	}

}
