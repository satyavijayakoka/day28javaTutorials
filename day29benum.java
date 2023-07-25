package javaTutorials;

enum Size{
	SMALL, MEDIUM, LARGE, EXTRALARGE;
}
class Order{
  Size pizzasize;
  public Order(Size pizzasize) {
	  this.pizzasize = pizzasize;
  }
  public void getConfirmation() {
	  switch(pizzasize) {
	  case SMALL :
		  System.out.println("size of pizza is small");
		  break;
	  case MEDIUM :
		  System.out.println("size of pizza is medium");  
		  break;
	  case LARGE:
		  System.out.println("size of pizza is large");
		  break;
	  case EXTRALARGE:
		  System.out.println("size of pizz is extralarge");
		  break;	  
		  
	  }
  }
}

public class day29benum {

	public static void main(String[] args) {
		
      Order order = new Order(Size.LARGE);
      order.getConfirmation();
	}

}
