package javaTutorials;

public class day22b1 {

	public static void main(String[] args) {

		TeacherN satyak = new TeacherN("satya", "koka", 35, 1200);

		System.out.println(satyak.firstname);
		System.out.println(satyak.lastname);
		System.out.println(satyak.age);
		System.out.println(satyak.salary);

		satyak.displayname();
		satyak.displaysalary();
	}

}

class StudentN {
	String firstname;
	String lastname;
	int age;

	public StudentN(String fn, String ln, int ag) {
		this.firstname = fn;
		this.lastname = ln;
		this.age = ag;
	}

	public void displayname() {
		System.out.println(this.firstname + this.lastname);
	}
}

class TeacherN extends StudentN {
	int salary;

	public TeacherN(String fn, String ln, int ag, int sal) {
		super(fn, ln, ag);
		this.salary = sal;
	}

	public void displaysalary() {
		System.out.println(this.salary);
	}

}
