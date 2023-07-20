package javaTutorials;
interface A{
	public void methodA();
}
interface B{
	public void methodB();
	
}
interface C{
	public void methodC();
	
}
public class day27dimplementsinheritance {

	public static void main(String[] args) {
		
	THREE satya = new THREE();
	satya.displayTWO1();
	satya.displayTWO2();
	satya.methodA();
	satya.methodB();

	}

}

class TWO {
	public void displayTWO1() {
		System.out.println("method TWO1");
	}
	public void displayTWO2() {
		System.out.println("method TWO2");
	}
}

class THREE extends TWO implements A, B{

	public void methodB() {
		System.out.println(" i am method of A");
		
	}

	public void methodA() {
		System.out.println("i am method of B");
			
	}
	
}


