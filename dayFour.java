package javaTutorials;

public class dayFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // calling the function
		Add();
		Add();
		Add();
		Add();
		Add();
        
		
		// calling the function AddB()
		AddB(12,5);
		AddB(8,9);
		AddB(100,55);
		
		// calling function AddC()
		int sum = AddC(13,7);
		System.out.println (sum);
		System.out.println(sum+sum);
		System.out.println(sum-sum);
		System.out.println(sum*sum);
		System.out.println(sum/sum);
		System.out.println(sum%sum);
		System.out.println(sum-9);
		System.out.println(sum*.10);
	}
	// writing Function  without parameter and without return type
	public static void Add() {
		System.out.println(8+8);
		
	}

//writing a function with parameter and without return type
	public static void AddB(int x, int y) {
		System.out.println(x+y);
	}
	// Writing a function with parameter and with return type
	public static int AddC(int x, int y) {
		return x+y;
	}
}
