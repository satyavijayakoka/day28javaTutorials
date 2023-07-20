package javaTutorials;

public class day18overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// program1

		Person[] students = { new Person("satya", "koka", 35), new Person("madhu", "duggirala", 39),
				new Person("koshika", "koka", 7), new Person("jathin", "koka", 4), new Person("shiva", "koka", 36) };

		// for loop
		for (int i = 0; i < students.length; i++) {
			students[i].displayName();
		}

		// while loop
		int t1 = 0;
		while (t1 < students.length) {
			students[t1].displayName();
			t1++;

		}

		// for each

		for (Person student : students) {
			student.displayName();
		}

		// PROGRAM2

		Calculator rashmi = new Calculator();
		rashmi.addition(2, 3);
		rashmi.addition(4, 7, 2);
		rashmi.addition(2, 7, 9, 1);

	}

}

class Person {
	String firstname;
	String lastname;
	int age;

	public Person(String fn, String ln, int ag) {
		this.firstname = fn;
		this.lastname = ln;
		this.age = ag;

	}

	public void displayName() {
		System.out.println(this.firstname + this.lastname);
	}
}

class Calculator {
	public void addition(int p, int q) {
		System.out.println(p + q);
	}

	public void addition(int p, int q, int r) {
		System.out.println(p + q + r);
	}

	public void addition(int p, int q, int r, int s) {
		System.out.println(p + q + r + s);
	}
}