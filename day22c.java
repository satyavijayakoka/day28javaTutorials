package javaTutorials;

public class day22c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Son shiva = new Son("venkateswarlu", "koka", "venaktaratnam", "shiva");
		System.out.println(shiva.firstname);
		System.out.println(shiva.lastname);
		System.out.println(shiva.Ffirstname);
		System.out.println(shiva.Sname);

		shiva.displayGname();
		shiva.displayFname();
		shiva.displaySname();

	}

}

class GrandFather {
	String firstname;
	String lastname;

	public GrandFather(String fn, String ln) {
		this.firstname = fn;
		this.lastname = ln;
	}

	public void displayGname() {
		System.out.println(this.firstname + this.lastname);
	}
}

class Father extends GrandFather {
	String Ffirstname;

	public Father(String fn, String ln, String Ffn) {
		super(fn, ln);
		this.Ffirstname = Ffn;
	}

	public void displayFname() {
		System.out.println(this.Ffirstname + this.lastname);
	}
}

class Son extends Father {
	String Sname;

	public Son(String fn, String ln, String Ffn, String Sn) {
		super(fn, ln, Ffn);
		this.Sname = Sn;
	}

	public void displaySname() {
		System.out.println(this.Sname + this.lastname);
	}
}
