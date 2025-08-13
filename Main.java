package employee;

public class Main {

	public static void main(String[] args) {
		Employee e1=new Employee("john",123, 35000);
		Employee e2=new Employee("shawn",124, 45000);
		System.out.println("initial details:");
		e1.display_details();
		e2.display_details();
		
		e1.increase_salary(0);
		e2.increase_salary(0);
		
		System.out.println("Updated Employee Details:");
		e1.display_details();
		e2.display_details();
	}

}
