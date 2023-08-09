package javaTutorials;

import java.util.List;
import java.util.stream.Collectors;

public class day37person {

	public static void main(String[] args){
		
		List<PersonD> peoples = List.of(
				new PersonD("satya koka", 35, "vijayawada"),
				new PersonD("madhu duggirala", 39, "hyderabad"),
				new PersonD("nalini velugoti", 32, "chirala"),
				new PersonD("sai madireddy", 38, "ibrahimpatnam"),
				new PersonD("shiva koka", 36, "vijayawada")
				);
		
		List<PersonD> above35Age = peoples.stream().filter(person-> person.getAge()>35).collect(Collectors.toList());
		
		System.out.println(above35Age);
		
		for(int i = 0; i< above35Age.size(); i++) {
			System.out.println(above35Age.get(i).getAge());
			System.out.println(above35Age.get(i).getCity());
			System.out.println(above35Age.get(i).getName());
		}
		
		// program 2
		// map and collect
		
		
		List<String> names = peoples.stream().map(person-> person.getName()).collect(Collectors.toList());
		
		for(String nm : names) {
			System.out.println(nm);
		}
		
		
		// program 3
		// person and city
		//" satya koka: vijayawada"
		
		List<String> hhh = peoples.stream().map(person-> person.getName().concat(" :").concat(person.getCity())).collect(Collectors.toList());
		
		
		for(String nc: hhh) {
		System.out.println(nc);
		
		
		}
		
		
		
		
		
		
		
		
	}

}

class PersonD{
	private String name;
	private int age;
	private String city;
	
	public PersonD(String name, int age, String city ) {
		this.name = name;
		this.age = age;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}
}


