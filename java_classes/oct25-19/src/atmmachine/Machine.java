package atmmachine;

public class Machine {

	public void open(ATM a) {

		a.validateCard();
		a.getInfo();
	}


}
