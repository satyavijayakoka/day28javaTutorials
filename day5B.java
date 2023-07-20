package javaTutorials;

public class day5B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Introvert || Extrovert
		// not social || social
		// calm || loud
		// less outing || more outing

		// Human
		// Properties - color , age , weight
		// Methods - walk(), talk()

		// Vehicle
		// Properties - color , model , regNo
		// Methods start() , stop()

		// Bank
		// Properties - bal , accNo , accName , city
		// Method - deposit() , with drawl()
		// boolean can driver= true;
		int x = 11;

		// comparison operator
		// < , > , <= , >=, != , ==

		System.out.println(5 < 3);
		System.out.println(9 > 5);
		System.out.println(6 <= 2);
		System.out.println(6 >= 2);
		System.out.println(5 <= 5);
		System.out.println(5 >= 5);
		System.out.println(7 != 7);
		System.out.println(7 != 5);
		System.out.println(9 == 9);
		
		// logical operator

		// AND --- &&

		// true   &&  true ------->   true
		// false  &&  true ------->   false
		// true   &&  false ------->  false
		// false  &&  false ------->  false

		System.out.println(13 == 13 &&  13 == 13);
		System.out.println(13 != 13 &&  9 == 9);
		System.out.println(6 == 6   &&  7 != 7);
		System.out.println(3 != 3   &&  4 != 4);
		
		// OR --- ||

		// true  ||  true ------->  true
		// false ||  true ------->  true
		// true  ||  false -------> true
		// false ||  false -------> false

		System.out.println(8 == 8   || 8 == 8);
		System.out.println(6 == 6   || 5 == 4);
		System.out.println(14 == 11 || 4 == 2);
		System.out.println(4 == 6   || 11 == 11);

		// NOT --- !

		// true ---- false
		// false ---- true

		System.out.println(!(2 == 3));
		System.out.println(!(11 == 11));

	}

}
