
public class TestSuperClass {
	
	final void add() {
		System.out.println("add method");
	}
	final void add(int a) {
		System.out.println("add int parameters::"+a);
	}
	
	public static void main(String[] args) {
		
		SuperClass sup = new SuperClass();
		System.out.println("***super class const****");
		SubClass sub = new SubClass();
		sub.getDta();
		TestSuperClass g = new TestSuperClass();
		g.add();
		g.add(20);
	}

}
