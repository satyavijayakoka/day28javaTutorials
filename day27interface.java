package javaTutorials;
interface WorldBankD{
	public void save(int x);
	public void loan(int y);
	
}

public class day27interface {

	public static void main(String[] args) {
		
		SBID sbi = new SBID();
		sbi.loan(0);
		sbi.save(0);
		
		PNBD pnb = new PNBD();
		pnb.loan(0);
		pnb.save(0);
		
	}

}

class SBID implements WorldBankD{

	
	public void save(int x) {
		
		System.out.println("this is save method for SBID");
	}

	public void loan(int y) {
		
System.out.println("this is a loan method for SBID");
		
	}
	
}

class PNBD implements WorldBankD{

	
	public void save(int x) {
		System.out.println("this is a  save method of PNBD");
			
	}
	
	public void loan(int y) {
		System.out.println("this is a loan method of PNBD");
			
	}
	
	
	
	
	
	
	
}