
public class SubClass extends SuperClass {
	
	String s = "sub class variable";
	
	SubClass(){
		super();
		System.out.println("sub class constructor");
	}
	void getDta() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		super.superClassMethod();
		superClassMethod();
	}
	

}
