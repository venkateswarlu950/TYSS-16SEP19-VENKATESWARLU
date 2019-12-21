
public abstract class Animal {

	abstract void makeNoise();

}
class Dog extends Animal {

	void makeNoise() {
		System.out.println("bow bow");
	}


}
class Snake extends Animal{

	void makeNoise() {
		System.out.println("shhh shhh shhh...");
	}

}



