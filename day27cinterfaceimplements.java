package javaTutorials;

interface EBA{
	public void save();
	public void loan();
}
interface EBI{
	public void displaycountry();
	public void displaycity();
}


public class day27cinterfaceimplements {

	public static void main(String[] args) {
		
	BankE ERIE = new BankE();
	ERIE.displaycity();
	ERIE.displaycountry();
	ERIE.loan();
	ERIE.save();
		
		
	}

}
//more than one interface can be implemented by class

class BankE implements EBA, EBI{

	
	public void displaycountry() {
		System.out.println("I am from USA");
		
	}
	
	public void displaycity() {
		System.out.println("I am from ERIE");
		
	}

	public void save() {
		System.out.println(" save method");
			
	}

	public void loan() {
		System.out.println("loan method");
		
		
	}
	
}

