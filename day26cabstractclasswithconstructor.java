package javaTutorials;

public class day26cabstractclasswithconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarE Honda = new CarE(4);
		System.out.println(Honda.wheel);
		Honda.brake();
	}

}

abstract class VehicleE {
	int wheel;

	public VehicleE(int w) {
		this.wheel = w;
	}

	abstract void brake();
}

class CarE extends VehicleE {
	public CarE(int w) {
		super(w);
	}

	public void brake() {
		System.out.println("i am brake for carE");
	}
}
