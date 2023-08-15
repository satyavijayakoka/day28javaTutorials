package javaTutorials;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class day38hashmappractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// hashmap
		//hashmap stores in the form of key-value pair
		
		HashMap<String,Integer> hashMapOne = new HashMap<>();
		System.out.println(hashMapOne);
          
		// ADD
		hashMapOne.put("one", 1);
		hashMapOne.put("two", 2);
		hashMapOne.put("three", 3);
		
		System.out.println(hashMapOne);
		
		// update
		System.out.println(hashMapOne.put("three", 77));
		
		// retrive
		
		int a = hashMapOne.get("one");
		System.out.println(a);
		
		
		hashMapOne.remove("two");
		System.out.println(hashMapOne.remove("two"));
		
		// allow duplicate keys??
		
		hashMapOne.put("three", 4);
		System.out.println(hashMapOne);
		
		// how many key values are there
		
		System.out.println(hashMapOne.size());
		
		
		HashMap<String , String> hashMapTwo = new HashMap<>(); 
		   
		  hashMapTwo.put("MH", "pune"); 
		  hashMapTwo.put("RJ", "jaipur"); 
		  hashMapTwo.put("UP", "lucknow"); 
		  hashMapTwo.put("RJ", "udaipur"); 
		  
		  // To check whether a key exist or not ?? 
		
		  if(hashMapTwo.containsKey("UP")) {
			  System.out.println(hashMapTwo.get("UP"));
		  }
		
		if(hashMapTwo.containsValue("lucknow")) {
			System.out.println("value available");
		}
		
		// containskey() and containsvalue()--- return boolean values
		
		
		for(String key: hashMapTwo.keySet()) {
			System.out.println(key);
			System.out.println(hashMapTwo.get(key));
		}
		
		System.out.println(hashMapTwo.keySet());
		System.out.println(hashMapTwo.values());
		
		for(Map.Entry<String, String> entry : hashMapTwo.entrySet()) {
			System.out.println(entry.getKey()+ ":"+entry.getValue());
		}
		
		HashMap<String , String> hashMapThree = new HashMap<>(); 
		  hashMapThree.put("satya","koka"); 
		  hashMapThree.put("madhu","duggirala"); 
		  hashMapThree.put("shiva","koka"); 
		  hashMapThree.put("jathin","koka"); 
		  hashMapThree.put("nalini","velugoti"); 
		  System.out.println(hashMapThree); 
		
		Iterator<Map.Entry<String, String>> abc = hashMapThree.entrySet().iterator();
		while(abc.hasNext()) {
			Map.Entry<String, String> entry = abc.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
				
		  
		  
		  
		  
		
		
	}

}
