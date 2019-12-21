
public class ParameterConstructor {
	String name;
	int id;

	ParameterConstructor(String ename, int eid) {
		name = ename;
		id = eid;
		System.out.println("name is ::"+name);
		System.out.println("id is ::"+id);

	}

	public static void main(String[] args) {
		ParameterConstructor pc = new ParameterConstructor("balaji", 001);
		ParameterConstructor pc1 = new ParameterConstructor("greeshma", 002);
		ParameterConstructor pc2 = new ParameterConstructor("vijay", 003);
		ParameterConstructor pc3 = new ParameterConstructor("mahesh", 004);

	}

}
