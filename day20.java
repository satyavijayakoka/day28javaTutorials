package javaTutorials;

public class day20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentB madhu = new StudentB();
		System.out.println(madhu.firstname);
		System.out.println(madhu.lastname);
		System.out.println(madhu.ssn);
		madhu.displayname();

		TeacherB madhuD = new TeacherB();
		System.out.println(madhuD.firstname);
		System.out.println(madhuD.lastname);
		System.out.println(madhuD.ssn);
		madhuD.displayname();
		madhuD.displaysalary();

	}

}

class StudentB {
	String firstname = "satya";
	String lastname = "koka";
	int ssn = 1001;

	public void displayname() {
		System.out.println(this.firstname + this.lastname);
	}
}

class TeacherB extends StudentB {
	int salary = 12000;

	public void displaysalary() {
		System.out.println(this.salary);
	}
}
