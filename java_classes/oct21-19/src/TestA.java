
public class TestA {
	public static void main(String[] args) {
		Pen	p= new Pen();
		Van v = new Van();
		p.cost = 100;
		p.color = "blue";
		p.brand = "Renolds";
		System.out.println("pen cost is ::"+p.cost+ " " +"pen color is ::"+p.color+ " " +"pen brand is ::"+p.brand);
		p.write();
		v.cost=20000;
		v.color= "black";
		v.move();
		System.out.println("van cost is ::"+v.cost+ " " +"van color is ::"+v.color);

		Van v1 = new Van();
		v1.cost = 3000000;
		v1.color = "white";
		v1.move();

		System.out.println("van cost is ::"+v1.cost+ " " +"van color is ::"+v1.color);
		
		

	}

}
