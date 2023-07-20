package javaTutorials;

public class day19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		Vehicle  C1   =  new Vehicle();
		Vehicle  C2   =  new Vehicle("audi");
		Vehicle  C3   =  new Vehicle("audi", "suv");

	}

}

class Vehicle {
	String name;
	String model;

	// Default constructor is always called;
	// class can have multiple constructor(constructor over loaded)
	// constructor don't have return type
	// constructor name should be similar to class name

	public Vehicle() {
		System.out.println("default constructor is called");

	}

	public Vehicle(String nm) {
		this.name = nm; 
		System.out.println("the name of vehicle" + this.name);
	}

	public Vehicle(String nm, String mdl) {
		this.name = nm;
		this.model = mdl;
		System.out.println("the name of vehicle" + this.name + this.model);
	}
}
