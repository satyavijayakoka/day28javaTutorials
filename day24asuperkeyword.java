package javaTutorials;

public class day24asuperkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		
		d.displaymessage();;

	}

}
// use of super keyword in java
class Animal{
	public void display() {
		System.out.println("i am animal");
	}
}

class Dog extends Animal{
	public void display() {
		System.out.println("i am dog");
		
	}
	public void displaymessage() {
		display();
		super.display();
	}
}

