
public class Student {
	String name;
	int rollNo;
	final String cname = "Qspiders";
	final int cid;
	
	  public Student(String name, int rollNo, int cid) {
		  this.name = name;
		  this.rollNo = rollNo;
		  this.cid = cid;
		  
	  }
	  final void printDetails() {
		  System.out.println("hi mr/miss "+name+" welcome to "+cname);
	  }
	  final void printDetails(String name) {
		  System.out.println("hi "+name+" welcome to"+cname);
	  }

}
