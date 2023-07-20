package javaTutorials;

public class day22coverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BOA erie = new BOA("USA", "erie");

		erie.loan();
		erie.save();
		erie.displaymessage();

	}

}

class Federalbank {
	String country;

	// constructor
	public Federalbank(String cn) {
		this.country = cn;
	}

	public void save() {
		System.out.println("i am save method of federalbank");
	}

	public void loan() {
		System.out.println(" i am loan method of federalbank");
	}

	public void displaymessage() {
		System.out.println("welcome to federalbank");
	}

}

class Eriebank extends Federalbank {
	String branchname;

	public Eriebank(String cn, String bn) {
		super(cn);
		this.branchname = bn;
	}
	// over riding the parent methods loan and save

	public void save() {
		System.out.println("i am save method of Eriebank");
	}

	public void loan() {
		System.out.println(" i am loan method of Eriebank");
	}
}

class BOA extends Federalbank {
	String branchname;

	public BOA(String cn, String bn) {
		super(cn);
		this.branchname = bn;
	}

	public void save() {
		System.out.println("i am save method of BOAbank");
	}

	public void loan() {
		System.out.println(" i am loan method of BOAbank");
	}

}
