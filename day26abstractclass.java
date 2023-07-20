package javaTutorials;

public class day26abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// you cannot create the object of abstract class
		 //WorldBankA a = new WorldBankA();

		SBIC hyderabad = new SBIC();
		hyderabad.displaybranch();
		hyderabad.displaycountry();
		hyderabad.loan();
		hyderabad.save();

	}

}

abstract class WorldbankB {
	abstract void loan();

	abstract void save();

	public void displaycountry() {
		System.out.println("i am from India");
	}
}

// you cannot create object of abstract class
class SBIC extends WorldbankB {
	public void loan() {
		System.out.println("i am loan of sbi");
	}

	public void save() {
		System.out.println("i am save from sbi");
	}

	public void displaybranch() {
		System.out.println("i am branch hyderabad");
	}
}

class PNBC extends WorldbankB {
	public void loan() {
		System.out.println("i am loan of PNBC");
	}

	public void save() {
		System.out.println("i am save from PNBC");
	}

	public void displaybranch() {
		System.out.println("i am branch hyderabad- PNBC");
	}
}
