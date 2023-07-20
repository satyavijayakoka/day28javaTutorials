package javaTutorials;

public class day22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student satya = new Student();
		satya.age = 35;
		satya.firstname = "satya";
		satya.lastname = "koka";

		System.out.println(satya.firstname);
		System.out.println(satya.lastname);
		System.out.println(satya.age);
		satya.displayname();

		// creating object of teacher
		TeacherA a = new TeacherA();
		a.displaysalary();
		a.firstname = "satya k";
		a.lastname = "koka k";
		a.age = 32;
		a.salary = 12000;
		System.out.println(a.firstname);
		System.out.println(a.lastname);
		System.out.println(a.age);
		System.out.println(a.salary);
		a.displayname();
		a.displaysalary();

	}

}

class Student {
	String firstname;
	String lastname;
	int age;

	public void displayname() {
		System.out.println(this.firstname + this.lastname);
	}
}

class TeacherA extends Student {
	int salary;

	public void displaysalary() {
		System.out.println(this.salary);
	}
}
