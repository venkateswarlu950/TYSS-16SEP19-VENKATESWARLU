package atmmachine;

public class TestA {
	
	public static void main(String[] args) {

		Machine m = new Machine();
		
		Hdfc h = new Hdfc();
		
		m.open(h);
		
		Icici i = new Icici();
		
		m.open(i);
		
		Sbi s = new Sbi();
		m.open(s);
	}

}
