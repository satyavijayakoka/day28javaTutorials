package javaTutorials;

public class day25privateandprotected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Furniture f = new Furniture("chair", "adjustable", 12000);
		// accessing properties

		System.out.println(f.name);
		System.out.println(f.type);
//System.out.println(f.cost);

// calling method
		f.displayname();
		f.displaycostandtype();

		// creating instance of child class

		Sofa S = new Sofa("ashley", "recliner", 15000, 4);
		System.out.println(S.name);
		System.out.println(S.legs);
		System.out.println(S.type);

		S.displaycostandtype();
		S.displayname();

		// over loading
		S.purchasedate(2011);
		S.purchasedate(2011, "aug");
		S.purchasedate(2011, "aug", 14);

		// parent method
		S.greetmesg();
		S.greetmesg2();

		int hr = S.displayhandrest();
		System.out.println(hr);

	}

}

class Furniture {
	String name;
	String type;
	private int cost;

	public Furniture(String nm, String ty, int ct) {
		this.name = nm;
		this.type = ty;
		this.cost = ct;
	}

	public void displayname() {
		System.out.println(this.name);
	}

	public void displaycostandtype() {
		System.out.println(this.cost);
		this.displaytype();
	}

	private void displaytype() {
		System.out.println(this.type);
	}

	public void greetmesg() {
		System.out.println("congrats on new furniture");
	}

	protected void greetmesg2() {
		System.out.println("congrats on new sofa");
	}
}

class Sofa extends Furniture {
	int legs;
	private int handrest = 2;

	public Sofa(String nm, String ty, int ct, int lg) {
		super(nm, ty, ct);
		this.legs = lg;
	}
	// same class, same method name, different signature

	public void purchasedate(int year) {
		System.out.println(year);
	}

	public void purchasedate(int year, String month) {
		System.out.println(year);
		System.out.println(month);

	}

	public void purchasedate(int year, String month, int date) {

		System.out.println(year);
		System.out.println(month);
		System.out.println(date);

	}

	public int displayhandrest() {
		return this.handrest;
	}
	// overriding
	// same method, same signature, different class(inheritance)

	public void greetmesg() {
		System.out.println("congrats on new sofa");
		super.greetmesg();
		super.greetmesg2();

	}

}
