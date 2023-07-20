package javaTutorials;
class D{
	public void GreetD() {
		System.out.println("hi");
	}
}
	class E{
		public void GreetE() {
			System.out.println("hello");
		}
	}
		class F extends E{	
	
}

public class day27b {

	public static void main(String[] args) {
		
		// only one class can be inherited
		
F camera = new F();
camera.GreetE();
	}

}
