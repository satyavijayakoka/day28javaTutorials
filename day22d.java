package javaTutorials;

public class day22d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SonC shiva = new SonC("venkataratnam", "koka", "shiva");
		DaughterC satya = new DaughterC("venkataratnam", "koka", "satya");
		shiva.displayFname();
		shiva.displaySname();

		satya.displayFname();
		satya.displayDname();

	}

}

class FatherC {
	String firstname;
	String lastname;

	public FatherC(String fn, String ln) {
		this.firstname = fn;
		this.lastname = ln;
	}

	public void displayFname() {
		System.out.println(this.firstname + this.lastname);
	}
}

class SonC extends FatherC {
	String Sname;

	public SonC(String fn, String ln, String Sn) {
		super(fn, ln);
		this.Sname = Sn;
	}

	public void displaySname() {
		System.out.println(this.Sname + this.lastname);
	}
}

class DaughterC extends FatherC {
	String Dname;

	public DaughterC(String fn, String ln, String Dn) {
		super(fn, ln);
		this.Dname = Dn;
	}

	public void displayDname() {
		System.out.println(this.Dname + this.lastname);
	}
}
