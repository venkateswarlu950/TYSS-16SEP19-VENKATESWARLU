
public class TestA {
	
	static int a;
	int b;
	
	static {
		a=10;
		System.out.println("static blok 1");
	}
	TestA(){
		System.out.println("test a constructor");
	}

	public static void main(String[] args) {
		TestA t = new TestA();
		TestA t1 = new TestA();
		System.out.println(a);
	}
	static {
		 a= 20;
		System.out.println("static block 2");
	}
}
