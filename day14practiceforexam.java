package javaTutorials;

public class day14practiceforexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
int[][]numbers = {
		{22,33,44},{222,333,444},{2222,3333,4444}
};

	//p1

for(int i = 0; i <numbers.length; i++) {
	int [] arr = numbers[i];
	for(int j = 0; j < arr.length; j++) {
		System.out.println(arr[j]);
	}
}

//p2

int t1 = 0;
while(t1 < numbers.length) {
	//System.out.println(t1);
	 int [] arr = numbers[t1];
	 int t2 = 0;
	 while(t2 < arr.length) {
		 System.out.println(arr[t2]);
		 t2++;
	 }
	 t1++;	
}

//p3
for(int [] row: numbers) {
	for( int  col: row) {
		System.out.println(col);
		
	}
}


String [][] names = { 
		
		{"jai","sam","joe"}, {"rita","syam","noel"},{"rahul","shiva","richa"}
};
	//p4
for(int i1 = 0; i1 < names.length; i1++) {
	String[] arr1 = names[i1];
	for(int j1 = 0; j1 < arr1.length; j1++) {
		System.out.println(arr1[j1]);
	}
}
	
//p5
int r1 = 0;
while(r1 < names.length) {
	String []arr1 = names[r1];
	int r2 = 0;
	while(r2 < arr1.length) {
		System.out.println(arr1[r2]);
		r2++;
	}
	r1++;
}


//p6
for(String [] row1: names) {
	for(String col1: row1) {
		
		System.out.println(col1);
	}
}













		
	}

}
