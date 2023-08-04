package javaTutorials;

interface Course{
	public void CourseOne();
	public void CourseTwo();
	public void CourseThree();
	public void CourseFour();
	public void CourseFive();
	public void CourseSix();
	
}
class zorba implements Course{

	@Override
	public void CourseOne() {
		// TODO Auto-generated method stub
		System.out.println("zorba one");
		
	}

	@Override
	public void CourseTwo() {
		// TODO Auto-generated method stub
		System.out.println("zorba two");
		
	}

	@Override
	public void CourseThree() {
		// TODO Auto-generated method stub
		System.out.println("zorba three");
		
	}

	@Override
	public void CourseFour() {
		// TODO Auto-generated method stub
		System.out.println("zorba four");
		
	}

	@Override
	public void CourseFive() {
		// TODO Auto-generated method stub
		System.out.println("zorba five");
		
	}

	@Override
	public void CourseSix() {
		// TODO Auto-generated method stub
		System.out.println("zorba six");
		
	}
	
}
class Minskole implements Course{

	@Override
	public void CourseOne() {
		// TODO Auto-generated method stub
		System.out.println("zorba one");
	}

	@Override
	public void CourseTwo() {
		// TODO Auto-generated method stub
		System.out.println("zorba two");
	}

	@Override
	public void CourseThree() {
		// TODO Auto-generated method stub
		System.out.println("zorba three");
		
	}

	@Override
	public void CourseFour() {
		// TODO Auto-generated method stub
		System.out.println("zorba four");
	}

	@Override
	public void CourseFive() {
		// TODO Auto-generated method stub
		System.out.println("zorba five");
	}

	@Override
	public void CourseSix() {
		// TODO Auto-generated method stub
		System.out.println("zorba six");
	}
	
}

public class day34a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course firm;
		firm = new zorba();
		firm.CourseSix();
		
		firm = new Minskole();
		firm.CourseOne();
		
		
		

	}

}
