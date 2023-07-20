package javaTutorials;

public class day26babstractclasswithoutconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat c = new Cat();
		c.eat();
		c.makesound();
	}

}

abstract class AnimalD {
	abstract void makesound();

	public void eat() {
		System.out.println("i can eat");
	}
}

class Cat extends AnimalD {
	public void makesound() {
		System.out.println("meow meow");
	}

}
