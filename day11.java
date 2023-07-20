package javaTutorials;

public class day11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// program 1
		// to print third index
		String name = "satya";
		char thirdindex = name.charAt(3);
		System.out.println(thirdindex);

		// program 2
		String name1 = "vijaya";
		int total = name1.length();
		System.out.println(total);

		// program 3

		for (int i = 0; i < total; i++) {
			System.out.println(name1.charAt(i));
		}
		// program 4
		String name2 = "lakshmi";
		int total1 = name2.length();
		for (int i = total1 - 1; i >= 0; i--) {
			System.out.println(name2.charAt(i));
		}
		// program 5
		String name3 = "erie";
		String uppercase = name3.toUpperCase();
		System.out.println(uppercase);
		// program 6
		String name4 = "CHICAGO";
		String lowercase = name4.toLowerCase();
		System.out.println(lowercase);
	}

}
