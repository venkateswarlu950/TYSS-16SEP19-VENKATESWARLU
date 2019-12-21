
public class TestB {

	 static int b;
	 int a;
	 
	 {
		 a=40;
		 b=50;
		 System.out.println("Initialisation block 1");
		 System.out.println(a);
	 }
	 
	 public static void main(String[] args) {
		
		 System.out.println("start main method ");
		 TestB t1 = new TestB();
		 System.out.println("end main method");
		 System.out.println("b valyue ::"+b);
		 
	}
	 {
		 a=52;
		 b=87;
		 System.out.println("intialoizarion block 2 ");
		 
	 }
}
