
public interface AutoMobile {
	
	int left = 20;
	int right = 10;
	
	public int gear();
	
	public void gps();
	

}

class BMW implements AutoMobile, AutoMobilesWithAbs {

	public int gear() {
		System.out.println("gear have speed change");
		return 10;
	}

	public void gps() {
		System.out.println("anakapalli station");
	}

	public void abs() {
        System.out.println("anti log breaking system");		
	}
	
}
class Tayoto implements AutoMobile {

	@Override
	public int gear() {
		System.out.println("gear have only 4");
		return 20;
	}

	@Override
	public void gps() {
      System.out.println("in nampalli station ");		
		
	}
	
	
}
