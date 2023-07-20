package javaTutorials;

public class day16oopsclasswithconstructorpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human3 madhu = new Human3("madhu duggirala",39);
		Human3 satya = new Human3("satya koka",35);
		
		System.out.println(madhu.age);
		System.out.println(madhu.name);
		System.out.println(satya.age);
		System.out.println(satya.name);
		
		
		String a = satya.talk();
		System.out.println(a);
		
		satya.walk();
		
		String b = madhu.talk();
		System.out.println(b);
		
		madhu.walk();
			
	
	}

}
class Human3 {
	String name;
	int age;
	public Human3(String nm,int ag) {
		this.name = nm;
		this.age = ag;
	}
	public String talk() {
		return("hi");
	}
	public void walk() {
		System.out.println("I am walking");
	}
}