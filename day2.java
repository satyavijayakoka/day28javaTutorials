package javaTutorials;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// program 1
		System.out.println("hello");

		// program2

		int a = 6;
		int b = 4;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

// program 3
//calling calculator

		Calculator(8, 5);
		Calculator(13, 11);

// program 4

		addA();
		addA();
		addA();

//program 5

		addB(5, 9);
		addB(11, 22);

		// program 6

		int r = addC(2, 4);
		System.out.println(r);
		System.out.println(r + r);
		System.out.println(r * r);

	}

	public static void Calculator(int x, int y) {
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x / y);
	}

	// function without parameter and without return type

	public static void addA() {
		System.out.println(8 + 8);
	}

	// function with parameters and without return type

	public static void addB(int p, int q) {
		System.out.println(p + q);
	}

	// function with parameter and return type

	public static int addC(int p, int q) {
		return p + q;
	}

}
