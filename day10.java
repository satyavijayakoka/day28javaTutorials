package javaTutorials;

public class day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// program 1
		int t1 = 1;
		while (t1 <= 7) {
			System.out.println(t1); // 1 //2 //3 //4 //5 //6 //7
			t1++; // 2 //3 //4 //5 //6 //7 //8
		}
		// program 2
		int t2 = 7;
		while (t2 <= 70) {
			System.out.println(t2); // 7 //14 //21 //28 //35 //42 //49 //56 //63 //70
			t2 = t2 + 7; // 14 //21 //28 //35 //42 //49 //56 //63 //70 //77
		}
		// program3
		int t3 = 30;
		while (t3 >= 3) {
			System.out.println(t3); // 30 //27 //24 //21 //18 //15 //12 //9 //6 //3
			t3 = t3 - 3; // 27 //24 //21 //18 //15 //12 //9 //6 //3 //0
		}
		// program4
		int t4 = 80;
		while (t4 >= 8) {
			if (t4 == 40) {
				break;
			}
			System.out.println(t4); // 80 //72 //64 //56 //48
			t4 = t4 - 8; // 72 //64 //56 //48 //40
		}
		// program 5
		int t5 = 1;
		while (t5 <= 10) {
			if (t5 == 4) {
				t5++; // 4
				continue;

			}
			System.out.println(t5); // 1 //2 //3 //5 //6 //7 //8 //9 //10
			t5++; // 2 //3 //5 //6 //7 //8 //9 //10 //11
		}
		// program 6
		int t6 = 1;
		while (t6 <= 4) {
			System.out.println("hello");
			t6++;
		}
		
		// program 7
		int t7 = 4;
		while(t7 >=4) {
			if(t7 == 12) {
				break;
		}
			System.out.println(t7);
		t7 = t7+4;
		}
		
		// program 8
		int t8 = 60;
		while(t8 >= 6  ) {
			if(t8 == 48) {
			t8 = t8-6;//48
				continue;
			}
			System.out.println(t8);
			t8 = t8-6;
		}
	}

}
