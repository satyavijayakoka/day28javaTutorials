package javaTutorials;


import java.util.List;
import java.util.Arrays;
public class day35stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee [] employees = {
				new Employee(1, "satya", 1000), new Employee(2, "madhu", 10000),
				new Employee(3, "shiva", 20000)
		};
		
		for(int i = 0; i < employees.length; i++) {
			employees[i].displayfullName();
		}
		
		List<Employee> emplist = Arrays.asList(employees);
		
		// for each()
		
		emplist.stream().forEach(emp-> emp.Incrementsalary(10));
		
		for(int i = 0; i < employees.length ; i++) {
			System.out.println(employees[i].salary);
		}
	}
	

}

class Employee{
	int id;
	String fullName;
	int salary;
	
	public Employee(int id, String fn, int sy) {
		this.id = id;
		this.fullName = fn;
		this.salary = sy;
		
	}
	public void displayfullName() {
		System.out.println(this.fullName);
	}
	
	public void Incrementsalary(int x) {
		this.salary = this.salary + x;
	}
}




