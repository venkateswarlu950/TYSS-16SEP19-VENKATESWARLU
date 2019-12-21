
public class Person {
	
	String name;
	int age;
	
	Person(String pname, int page){
		name = pname;
		age = page;
		System.out.println("name is ::"+name);
		System.out.println("age is ::"+age);
	}
	public static void main(String[] args) {
		Person p = new Person("venkat", 25);
		System.out.println("name in main ::"+p.name);
		System.out.println("age in main::"+p.age);
	}

}
