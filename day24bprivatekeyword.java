package javaTutorials;

public class day24bprivatekeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnimalB cat = new AnimalB(5);
		// System.out.println(cat.age);
		cat.displayage();
		int q1 = cat.updateage(11);
		System.out.println(q1);

		
		cat.displaymessage();
	}

}

class AnimalB {
	private int age;
	public AnimalB(int ag) {
		this.age = ag;
	}
	// method returning string
	
	private String displayname() {
		return "i am dog";
	}
	public void displayage() {
		System.out.println(this.age);
	}
	
	// method returning int
	
	public int updateage(int updatedAgee) {
		 this.age = updatedAgee;
	 return this.age;
	}
     public void displaymessage() {
      String msg = displayname();
        System.out.println(msg);
	 }
}
