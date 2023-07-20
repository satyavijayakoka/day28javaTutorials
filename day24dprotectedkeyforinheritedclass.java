package javaTutorials;

public class day24dprotectedkeyforinheritedclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Professor f = new Professor("maths");
		f.displaysubjects();
		f.abc();

	}

}

class TeacherE {
	protected String subject;

	public TeacherE(String sub) {
		this.subject = sub;
	}

	public void abc() {
		System.out.println("teacher abc");
	}
}

class Professor extends TeacherE {
	String subject = "chemistry";

	public Professor(String sub) {
		super(sub);
	}

	public void displaysubjects() {
		System.out.println(this.subject);
		System.out.println(super.subject);
	}

	public void abc() {
		System.out.println("professor abc");
		super.abc();
	}
}

//today 24th class===>
// private field and private method
//super keyword for method and super keyword for field
//protected keyword for inherited class
