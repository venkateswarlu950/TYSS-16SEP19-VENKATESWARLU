
public class TestD {

	public static void main(String[] args) {
		BTM b = new BTM();
		b.swipe();
		int count = b.getCount();
		System.out.println("the count is ::"+count);
		int total = b.getTotalCount();
		System.out.println("total count ::"+total);
	}

}
