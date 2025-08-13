package employee;

public class Employee {
	String name;
	int id;
	double salary;
	
	Employee(String name,int id,double salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
		
	}
void display_details() {
	System.out.println("employee name: "+this.name);
	System.out.println("employee id: "+this.id);
	System.out.println("employee salray: "+this.salary);
}
	
void increase_salary(double percentage) {
	double increment=(10*this.salary)/100;
	this.salary = this.salary+increment;
	System.out.println("incremented salary is "+this.salary);
}
}



