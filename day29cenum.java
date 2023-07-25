package javaTutorials;
enum Size1{
	SMALL, MEDIUM, LARGE, EXTRALARGE;
	
	public String getSize() {
		
		switch(this) {
		case SMALL:
			return "the shirt size is small";
		case MEDIUM:
			return "the shirt size is medium";
		case LARGE :
			return "the shirt size is large";
		case EXTRALARGE :
			return "the shirt size is extralarge";
			default:
				return "null";
				
		}
		
		
		
	}
}
public class day29cenum {

	public static void main(String[] args) {
		
String order = Size1.MEDIUM.getSize();
System.out.println(order);

	}

}
