package javaTutorials;



public class day29aenum {
	enum roles{
		ADMIN, SALES, SUPPORT, CUSTOMER, MANAGER;
	}

	public static void main(String[] args) {
		System.out.println(roles.CUSTOMER);
		System.out.println(roles.MANAGER);

	}

}
