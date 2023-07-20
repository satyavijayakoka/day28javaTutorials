package javaTutorials;

public class dayFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// calling sub()
		sub();
		sub();
		sub();
		sub();
		sub();
		// calling subB()
		subB(5, 2);
		subB(10, 3);
		subB(10, 5);
		// calling subC()
		int z = subC(10, 7);
		System.out.println(z);
	}

	// function without parameter and without return
	public static void sub() {
		System.out.println(10 - 5);
	}

	// function with parameter and without return
	public static void subB(int x, int y) {
		System.out.println(x - y);
	}

	// function with parameter and with return type
	public static int subC(int x, int y) {
		return x - y;
	}
}
