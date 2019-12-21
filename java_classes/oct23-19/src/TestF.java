
public abstract class TestF {
	
	abstract void color();
	abstract void shape();

}

class TestG extends TestF{
	
	
	void color () {
		System.out.println("color is black");
	}

	void shape() {
		System.out.println("shape is circle");
	}
}
