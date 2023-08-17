package javaTutorials;

public class day39instanceofclass {

	public static void main(String[] args) {
		
		Dog2 d2 = new Dog2();
		System.out.println(d2 instanceof Dog2);
		System.out.println(d2 instanceof Animal2);
		
		Invoice inv = new Invoice("123", "satya", "koka", "12345", "124");
		System.out.println(inv instanceof Invoice);

	}

}


class Animal2{
	
}

class Dog2 extends Animal2{
	
}

class Invoice{
	String billNo;
	String firstName;
	String lastName;
	String phoneNo;
	String address;
	
	public Invoice(String bn, String fn, String ln, String phNo, String address) {
		this.billNo = "123";
		this.firstName = "satya";
		this.lastName = "koka";
		this.phoneNo = "12345";
		this.address = "124";
				
		
	}
}