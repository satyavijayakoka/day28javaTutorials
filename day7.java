package javaTutorials;

public class day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// switch case without break statement
		//program 1
	
		String city = "Erie";
		switch (city) {
		case "Erie":
			System.out.println("PA");
		case "Buffalo":
			System.out.println("NY");
		case "Chicago":
			System.out.println("IL");
		case "Frankfurt":
		System.out.println("KY");
		default:
			System.out.println("Incorrect city name");
			
		}
		// program 2
		String city2 = "Buffal";
		switch(city2 ) {
		case "Erie":
		System.out.println("PA");
		break;
		case "Buffalo":
			System.out.println("NY");
			break;
		case "Chicago":
			System.out.println("IL");
			break;
		case "Frankfurt":
		System.out.println("KY");
		break;
		default:
			System.out.println("Incorrect city name");
		}
		// program 3
		String city3 = "Bloomington";
		switch(city3) {
		case "Erie":
		case "phildelphia":
			System.out.println("PA");
			break;
			case "Buffalo":
			case "Newyork":
				System.out.println("NY");
				break;
			case "Chicago":
			case "Bloomington":
				System.out.println("IL");
				break;
			case "Frankfurt":
			case "Bowling green":
			System.out.println("KY");
			break;
			default:
				System.out.println("Incorrect city name");
			
		}
		// program 4
		String city4 = "Vijayawad";
		switch(city4) {
		case "Vijayawada":
			System.out.println("AP");
			break;
		case "Pune":
			System.out.println("MH");
			break;
		case "Hyderabad":
			System.out.println("TN");
			break;
		case "Banglore":
			System.out.println("KT");
			break;
			default:
				System.out.println("Incorrect city name");
		}
	}

}
