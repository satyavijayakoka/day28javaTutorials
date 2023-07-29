package javaTutorials;

import java.util.ArrayList;

public class day31barraylist {

	public static void main(String[] args) {
		PersonY satya1 = new PersonY("satya1", "koka");
		PersonY satya2 = new PersonY("satya2", "koka");
		PersonY satya3 = new PersonY("satya3", "koka");
		PersonY satya4 = new PersonY("satya4", "koka");
		PersonY satya5 = new PersonY("satya5", "koka");
		
		ArrayList< PersonY> students = new ArrayList<>();
		
		students.add(satya1);
		students.add(satya2);
		students.add(satya3);
		students.add(satya4);
		students.add(satya5);
		students.get(0).display();	
		
		
		for(int i = 0; i < students.size(); i++) {
			// System.out.println(i);
			System.out.println(students.get(i).firstName);
			System.out.println(students.get(i).lastName);
			students.get(i).display();
			
		}
		
		int t1 = 0;
		while(t1 < students.size()) {
			System.out.println(students.get(t1).firstName);
			System.out.println(students.get(t1).lastName);
			students.get(t1).display();
			t1++;
		}
		
		for(PersonY y : students) {
			System.out.println(y.firstName);
			System.out.println(y.lastName);
			y.display();
		}

	}

}

class PersonY{
	String firstName;
	String lastName ;
	public PersonY(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
		
	}
	public void display() {
		System.out.println(this.firstName + this.lastName);
	}
}


