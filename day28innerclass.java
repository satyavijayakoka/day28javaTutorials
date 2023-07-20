package javaTutorials;

public class day28innerclass {

	public static void main(String[] args) {
		
		
		
		Car audi = new Car("q4","sedane");
		Car honda = new Car("xu7008","suv");
		Car.Engine i = audi.new Engine();
		Car.Engine k = honda.new Engine();
		i.Enginesize();
		k.Enginesize();

	}

}

class Car {
	String Carname;
	String Cartype;
	public Car(String cn, String ct) {
		this.Carname = cn;
		this.Cartype = ct;
	}
	public void Greet() {
		System.out.println("congrats on mew car".concat(this.Carname));
	}
	// inner class
	class Engine{
		String Enginesize;
		// accessing the outer class fields into inner class
		public void Enginesize() {
			if(Car.this.Cartype.equals("sedane")) {
				this.Enginesize = "smaller";
				System.out.println(this.Enginesize);
			}
			else if(Car.this.Cartype.equals("suv")) {
				this.Enginesize = "bigger";
				System.out.println(this.Enginesize);
			}
		}
		
	}
}

