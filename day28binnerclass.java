package javaTutorials;

public class day28binnerclass {

	public static void main(String[] args) {
		CPU C = new CPU();
		
		int P = C.displayprice();
		System.out.println(P);
		
		CPU.Processor PRO = C.new Processor();
		System.out.println(PRO.manufacturer);
		System.out.println(PRO.displayspeed());

	}

}

class CPU{
	int price = 100;
	
	public int displayprice() {
		return this.price;
	}
	class Processor{
		String manufacturer = "intel";
		public String displayspeed() {
			return "fast";
		}
	}
}

