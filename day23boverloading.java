package javaTutorials;

public class day23boverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculatorB x = new CalculatorB();
		x.subtraction(121, 87);
		x.subtraction(121, 87, 23);
		x.subtraction(121, 87, 23, 11);

	}

}

class CalculatorB {
	public void subtraction(int a, int b) {
		System.out.println(a-b);
	}

	public void subtraction(int a, int b, int c) {
		System.out.println(a - b - c);
	}

	public void subtraction(int a, int b, int c, int d) {
		System.out.println(a - b - c - d);
	}
}
