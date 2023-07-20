package javaTutorials;

public class day8exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Q1 calling Add();
		int z = Add(9, 7);
		System.out.println(z);

		// Q2 Arithmetic operation
		int x = 7;
		int y = 5;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);
		// Q3 if condition
		int a = 7;
		int b = 5;
		int c = 8;
		if (a > b && a > c) {
			System.out.println("a is greater");
		} else if (b > a && b > c) {
			System.out.println("b is greater");
		} else {
			System.out.println("c is greater");
		}
		// Q4 switch
		String city = "Erie";
		switch (city) {
		case "Erie":
			System.out.println("PA");
			break;
		case "Buffalo":
			System.out.println("NY");
			break;
		case "Chicago":
			System.out.println("IL");
			break;
		case "Frankfurt":
			System.out.println("KT");
		default:
			System.out.println("Incorrect city name");
		}

	}

	public static int Add(int x, int y) {
		return x + y;

	}
}
