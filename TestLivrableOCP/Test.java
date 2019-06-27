/**
 * @author samirromdhani
 */
public class Test {
	static int testCount = 0; // Declare and initialize static variable

	Test(int x) {
		System.out.println("1-arg const");
	}

	Test() {
		super();
		testCount += 1; // Modify the value in the constructor
		System.out.println("no-arg const");
	}

	static {
		System.out.println("1st static init");
	}
	{
		System.out.println("1st instance init");
	}
	{
		System.out.println("2nd instance init");
	}
	static {
		System.out.println("2nd static init");
	}

	public static void main(String[] args) {
//		new Test();
//		new Test();
//		new Test();
//		System.out.println("Test count is now " + testCount);
		new Test();
		new Test(7);
	}
}
