package javaTutorials;

public class day21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentC sandhya = new StudentC("sandhya","rani",921);
		System.out.println(sandhya.firstname);
		System.out.println(sandhya.lastname);
		System.out.println(sandhya.ssn);
		sandhya.displayname();
		
		
		TeacherC sandhyal = new TeacherC ("sandhyal","ranil",921,22000);
		System.out.println(sandhyal.firstname);
		System.out.println(sandhyal.lastname);
		System.out.println(sandhyal.ssn);
		System.out.println(sandhyal.salary);
		sandhyal.displayname();
		sandhyal.displaysalary();
		
		
		
	}

}
class StudentC {
	String firstname;
	String lastname;
	int ssn;
	public StudentC (String fn, String ln, int ss) {
		this.firstname = fn;
		this.lastname = ln;
		this.ssn = ss;
	}
	public void displayname() {
		System.out.println(this.firstname + this.lastname);
	}
}

class TeacherC extends StudentC {
	int salary ;
	
	// Mandatory to have child constructor as parent is having 
		// constructor
		// FirstLine of child constructor should be called to parent 
		//.. constructor
		
	public TeacherC(String fn, String ln, int ss, int sal) {
		super(fn,ln,ss);
		this.salary = sal;
		
	}
	public void displaysalary() {
		System.out.println(this.salary);
	}
}

