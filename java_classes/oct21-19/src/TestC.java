
public class TestC {
public static void main(String[] args) {
	Person.color = "white";
	Person.sleep();
	Person p = new Person();
	p.name = "venkat";
	p.age = 27;
	System.out.println("person name:: "+p.name);
}
}
