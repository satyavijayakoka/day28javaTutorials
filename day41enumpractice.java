package javaTutorials;

enum Sizee{
	SMALL, MEDIUM, LARGE, EXTRALARGE
	
}

class Testsize{
	
	Sizee Tshirt;
	
	public Testsize(Sizee tshirt) {
		
		this.Tshirt = tshirt;
	}
	
	public void buyTshirt() {
		
		switch(Tshirt) {
		case SMALL:
			System.out.println("i am buying small tshirt");
			break;
		case MEDIUM:
			System.out.println("i am buying medium tshirt");
			break;
		case LARGE:
			System.out.println("i am buying large tshirt");
			break;
		case EXTRALARGE:
			System.out.println("i am buying extralarge tshirt");
			break;
			default:
				System.out.println("i am not aware of size");
		}
	}
	
}


public class day41enumpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Testsize t = new Testsize(Sizee.MEDIUM);
		t.buyTshirt();
		
		

	}

}
