
public class Students {
	int stuRef;
	String name;
	String study;
	int mobF;
	String address;

	Students(int stuRef, String name, String study, int mobF, String address){
		this.stuRef=stuRef;
		this.name = name;
		this.study = study;
		this.mobF = mobF;
		this.address = address;

	}
	void showDetails() {
		System.out.println("student ref::"+stuRef);
		System.out.println("name::"+name);
		System.out.println("his class ::"+study);
		System.out.println("mobile number::"+mobF);
		System.out.println("address is::"+address);
	}

	public static void main(String[] args) {
		Students s = new Students(90001, "sudeer", "9th", 1245, "nellore");
		s.showDetails();
		Students s1 = new Students(90002, "rashmi", "8th", 3214, "hyd");
		s1.showDetails();
		Students s2 = new Students(90003, "akhil", "7th", 5879, "vijayawada");
		s2.showDetails();
		Students s3 = new Students(90004, "ravi", "6th", 2147, "chennai");
		s3.showDetails();
		Students s4 = new Students(90005, "manoj", "9th", 9658, "pune");
		s4.showDetails();
		Students s5 = new Students(90006, "khaleel", "4th", 3256, "kammam");
		s5.showDetails();
		Students s6 = new Students(90007, "sheik", "10", 7894, "warangal");
		s6.showDetails();

	}

}
