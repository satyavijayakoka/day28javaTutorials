package javaTutorials;

public class day16oopswithconstuctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human2 Satya = new Human2("Satya Koka", 35);
		Human2 Madhu = new Human2("Madhu Duggirala", 39);

		System.out.println(Madhu.age);

		System.out.println(Madhu.name);

		System.out.println(Satya.age);

		System.out.println(Satya.name);

		String a = Satya.talk();
		System.out.println(a);

		Satya.speak();
		Satya.walk();
	}

}

class Human2 {
	int age;
	String name;

	public Human2(String nm, int ag) {
		this.name = nm;
		this.age = ag;
	}

	public String talk() {
		return "Hello";
	}

	public void walk() {

		System.out.println("I am walking");
	}

	public void speak() {
		System.out.println("I can speak");
	}
}