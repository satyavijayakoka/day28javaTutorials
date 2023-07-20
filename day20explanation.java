package javaTutorials;

public class day20explanation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// only for understanding the concept
		
		
		Students a = new Students();
		System.out.println(a.firstName);
		System.out.println(a.lastName);
		System.out.println(a.ssn);

		
		// Creating instance of Teacher class
		
		Teacher aa = new Teacher();
		System.out.println(aa.salary);
		System.out.println(aa.firstName);
		System.out.println(aa.lastName);
		System.out.println(aa.ssn);
		aa.displaySalary();
		aa.displayName();		
		
	}

}

class Students {

	String firstName = "chinmay";
	String lastName = "deshpande";
	int ssn = 123;

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}

}

// not a correct way
//class Teacher {
//	
//	String firstName = "chinmay";
//	String lastName = "deshpande";
//	int ssn = 123;
//	int salary = 1000;
//	
//	public void displayName() {
//		System.out.println(this.firstName + this.lastName);
//	}
//	
//	public void displaySalary() {
//		System.out.println(this.salary);
//	}
//}

class Teacher extends Students {

	int salary = 1000;

	public void displaySalary() {
		System.out.println(this.salary);
	}
}
