package javaTutorials;

public class day23aoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		additionA(101, 203);
		additionA(101, 203, 256);
		additionA(101, 203, 256, 342);
	}

// over loading- same class, same method ,different signature
	// method 1
	public static void additionA(int x, int y) {
		System.out.println(x + y);
	}

	// method 2
	public static void additionA(int x, int y, int z) {
		System.out.println(x + y + z);
	}

	// method 3
	public static void additionA(int x, int y, int z, int a) {
		System.out.println(x + y + z + a);
	}
}
