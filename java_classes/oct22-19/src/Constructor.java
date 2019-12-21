
public class Constructor {

	Constructor(){
		System.out.println("constructoin");
	}
	public static void main(String[] args) {
		System.out.println("main method");
		Constructor c = new Constructor();
		System.out.println("main end");
	}
}
