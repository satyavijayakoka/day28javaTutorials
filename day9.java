package javaTutorials;

public class day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// print 1 to 5

		// System.out.println(1);
		// System.out.println(2);
		// System.out.println(3);
		// System.out.println(4);
		// System.out.println(5);

		// loops - for loop
		// for(initialization ; conditional check ; increment/decrement) {
		// statements
		// }

		// program 1
		for (int i = 1; i <= 5; i++) {  // 2 //3 //4 //5 //6
			System.out.println(i);   // 1 //2 //3 //4 //5
		}
		// program 2
		for (int i = 5; i >= 1; i--) { // 4 //3 //2 //1 //0
			System.out.println(i);  // 5 //4 //3 //2 //1
		}

		// program 3
		for (int i = 2; i <= 20; i = i + 2) { // 4 //6 //8 //10 //12 //14 //16 //18 //20 //22
			System.out.println(i);      // 2 //4 //6 //8 //10 //12 //14 //16 //18 //20
		}
		// program 4
		// for loop with break;
		for (int i = 1; i <= 5; i++) { // 2 //3
			if (i == 3) {
				break;

			}
			System.out.println(i);  // 1 //2

		}
		// program 5
		for (int i = 50; i >= 5; i = i - 5) { // 45 //40
			System.out.println(i); // 50 //45 //40
			if (i == 40) {
				break;
			}
		}
		// program 6
		// continue statement with for

		for (int i = 1; i <= 3; i++) { // 2 //3 //4
			if (i == 2) {
				continue;
			}
			System.out.println(i); // 1 //3
		}
		// program 7
		for (int i = 5; i >= 1; i--) { // 4 //3 //2 //1
			if (i == 2) {
				continue;
			}
			System.out.println(i); // 5 //4 //3 //1
		}
		// program 8
		for(int i = 3; i <= 30; i= i+3) {
			if (i == 15)  {
				break;
			}
			System.out.println(i);
			
		}
		// program 9
		for(int i = 100; i >= 10; i= i-10) {
			if(i == 70) {
				break;
			}
			System.out.println(i);
		}
		
	}

}
