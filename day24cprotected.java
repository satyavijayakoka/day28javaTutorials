package javaTutorials;

public class day24cprotected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HumanC c = new HumanC(456);
		System.out.println(c.SSN);

		StudentE e = new StudentE(987);
		e.displaySSN();

	}

}

class HumanC {
	protected int SSN;

	public HumanC(int ssn) {
		this.SSN = ssn;
	}
}

class StudentE extends HumanC {
	public StudentE(int ssn) {
		super(ssn);
	}

	public void displaySSN() {
		System.out.println(this.SSN);
	}
}
