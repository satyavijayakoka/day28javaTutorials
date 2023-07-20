package javaTutorials;

public class revisionclassoopsconcept {

	public static void main(String[] args) {
		
		// program 1 (creating object)
		
		StudentH Jathin = new StudentH();
		System.out.println(Jathin.firstname);
		System.out.println(Jathin.lastname);
		Jathin.display();
		
		
		// program 2
		
		Student2 Jathin2 = new Student2("Jathin2", "koka2");
		System.out.println(Jathin2.firstname);
		System.out.println(Jathin2.lastname);
		Jathin2.display();
		
		
		// program 3
		
		Student3 Jathin3 = new Student3();
		System.out.println(Jathin3.firstname);
		System.out.println(Jathin3.lastname);
		
		Jathin3.setFirstname("Jathin3");
		Jathin3.setLastname("koka3");
		Jathin3.display();
		System.out.println(Jathin3.firstname);
		System.out.println(Jathin3.lastname);

	}

}

class StudentH {
	String firstname = "satya";
	String lastname = "koka";
	
	public void display() {
		System.out.println(this.firstname + this.lastname);
	}
}

class Student2{
	String firstname;
	String lastname;
	public Student2(String fn, String ln) {
	   this.firstname = fn;
	   this.lastname = ln;
	}
	public void display() {
		System.out.println(this.firstname + this.lastname);
	}
}

class Student3{
	String firstname;
	String lastname;
	public void setFirstname(String fn) {
		this.firstname = fn;
		
	}
	public void setLastname(String ln) {
		this.lastname = ln;
	}
	
	public void display() {
		System.out.println(this.firstname + this.lastname);
	}
	
}
