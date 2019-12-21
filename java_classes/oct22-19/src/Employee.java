
public class Employee {
	String name;
	int id;

	Employee(String name, int id) {
		this.name = name;
		this.id = id;

	}
	void printDetails() {
		System.out.println("emp name is ::"+name);
		System.out.println("emp id is ::"+id);
		this.sayHello();
	}
	void sayHello() {
		System.out.println("hello miss/mr "+name+" welcome to testyantra");
	}
	public static void main(String[] args) {
		
		Employee e = new Employee("raja sekar", 4889);
		e.printDetails();
		Employee e1 = new Employee("govardan", 2145);
		e1.printDetails();
		Employee e2 = new Employee("rakesh", 4789);
		e2.printDetails();
		
	}

}
