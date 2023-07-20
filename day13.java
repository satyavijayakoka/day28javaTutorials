package javaTutorials;

public class day13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// progam 1

		// type [] nameOfArray = new type[lengthOfarray]
		// Array stores the value by index

		int[] numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;

		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);

		int[] numbers2 = { 111, 222, 333, 444, 555 };
		System.out.println(numbers2[0]);
		System.out.println(numbers2[1]);
		System.out.println(numbers2[2]);
		System.out.println(numbers2[3]);
		System.out.println(numbers2[4]);

		// program2

		String[] cities = new String[5];

		cities[0] = "Erie";
		cities[1] = "lakeview";
		cities[2] = "fairview";
		cities[3] = "chicago";
		cities[4] = "newyork";

		// looping through array

		for (int i = 0; i < cities.length; i++) {

			System.out.println(cities[i]);
		}

		int[] marks = { 35, 60, 75, 85, 25, 90 };
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

		for (int i = marks.length - 1; i >= 0; i--) {
			System.out.println(marks[i]);

			// program 3

			int[] mks = { 12, 24, 36, 48, 60, 72, 84, 96, 108, 120 };
			int t1 = 0;

			while (t1 < mks.length) {
				System.out.println(mks[t1]);
				t1 = t1 + 1;

			}

			int t2 = mks.length - 1;
			while (t2 >= mks.length - 1) {
				System.out.println(mks[t2]);
				t2 = t2 - 1;
			}

			// program4(for each loop)
			String[] flowers = { "jasmine", "rose", "marygold" };

			for (String item : flowers) {
				System.out.println(item);
			}

			int[] numbers3 = { 13, 15, 17, 19, 21 };

			for (int b : numbers3) {
				System.out.println(b);
			}
			
			String [] names1 = {"vijaya","kavitha","nalini","neelima","sai"};
			for(String  name : names1) {
				System.out.println(name);
				
			}
			
			String [] colors = {"blue","black","brown","purple","orange"};
			for(String col : colors) {
				System.out.println(col);
			}
			
			int [] numbers4 = {1100,2200,3300,4400,5500,6600};
			
			for(int n4 : numbers4) {
				System.out.println(n4);
			}
			

		}

	}

}
