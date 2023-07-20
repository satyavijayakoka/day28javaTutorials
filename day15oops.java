package javaTutorials;

public class day15oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int
		// boolean
		// string
		// array
		// char
		// user defined data type

		// creating an instance or object

		Human Satya = new Human();
		System.out.println(Satya.age);
		System.out.println(Satya.name);

		Satya.walk();
		Satya.talk();

		Satya.age = 35;
		Satya.name = "Satya Koka";
		System.out.println(Satya.age);

		System.out.println(Satya.name);

		// creating an object
		Human Madhu = new Human();

		System.out.println(Madhu.age);
		System.out.println(Madhu.name);

		Madhu.walk();
		Madhu.talk();

		Madhu.age = 39;
		Madhu.name = "Madhu Duggirala";
		System.out.println(Madhu.age);

		System.out.println(Madhu.name);

	}

}

class Human {
	// properties and methods
	int age;
	String name;

	// methods
	public void talk() {
		System.out.println("I am talking");
	}

	public void walk() {
		System.out.println("I am walking");
	}
}