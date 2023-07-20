package javaTutorials;

public class day25exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Q1
		
		int l = add(2, 3);
		// Q2
		
		PersonE ravi = new PersonE("ravi k", 26);
		System.out.println(ravi.name);
		System.out.println(ravi.age);
		ravi.speak();
		// Q3

		SonA jathin = new SonA("ratnam ", "koka", "shiva", "jathin");
		System.out.println(jathin.firstname);
		System.out.println(jathin.lastname);
		System.out.println(jathin.Ffirstname);
		System.out.println(jathin.Sname);

		jathin.displayFname();
		jathin.displayname();
		jathin.displaySname();
		// Q4
		
		SBI hyderabad = new SBI("INDIA", "hyderabad");
		hyderabad.save();
		hyderabad.displaymessage();

		// Q5
		CalculatorD d = new CalculatorD();
		d.addition(2, 3);
		d.addition(2, 3, 4);
		d.addition(2, 3, 4, 5);

	}

//Q1
	public static int add(int x, int y) {
		return (x + y);
	}

}

// Q2

class PersonE {
	String name;
	int age;

	public PersonE(String nm, int ag) {
		this.name = nm;
		this.age = ag;
	}

	public void speak() {
		System.out.println(" i can speak");

	}
}

//Q3
class GrandfatherA {
	String firstname;
	String lastname;

	public GrandfatherA(String fn, String ln) {
		this.firstname = fn;
		this.lastname = ln;
	}

	public void displayname() {
		System.out.println(this.firstname + this.lastname);

	}
}

class FatherA extends GrandfatherA {
	String Ffirstname;

	public FatherA(String fn, String ln, String Fn) {
		super(fn, ln);
		this.Ffirstname = Fn;
	}

	public void displayFname() {
		System.out.println(this.Ffirstname + this.lastname);
	}

}

class SonA extends FatherA {
	String Sname;

	public SonA(String fn, String ln, String Fn, String Sn) {
		super(fn, ln, Fn);
		this.Sname = Sn;
	}

	public void displaySname() {
		System.out.println(this.Sname + this.lastname);
	}
}

//	Q4

class Worldbank {
	String country;

	public Worldbank(String cn) {
		this.country = cn;
	}

	public void save() {
		System.out.println("i am save method of world bank");
	}

	public void displaymessage() {
		System.out.println("welcome to world bank");
	}
}

class PNB extends Worldbank {
	String branchname;

	public PNB(String cn, String bn) {
		super(cn);
		this.branchname = bn;

	}

	public void save() {
		System.out.println("i am save method of PNB");
	}
}

class SBI extends Worldbank {
	String branchname;

	public SBI(String cn, String bn) {
		super(cn);
		this.branchname = bn;
	}

	public void save() {
		System.out.println("i am save method of SBI");
	}
}
//Q5

class CalculatorD {
	public void addition(int p, int q) {
		System.out.println(p + q);
	}

	public void addition(int p, int q, int r) {
		System.out.println(p + q + r);
	}

	public void addition(int p, int q, int r, int s) {
		System.out.println(p + q + r + s);
	}

}


