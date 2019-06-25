
/**
 * javac -source 1.3 Test.java -> warning: as of release 1.4, 'assert' is a keyword, and may not be used as an identifier
 * 
 * javac -source 1.4 Test.java -> Compiles with warnings
 * 
 * javac -source 1.8 Test.java -> Compiles
 * 
 * You enable assertions at runtime with: java -ea com.ensi.Test
 * You disable assertions at runtime with: java -da com.ensi.Test
 * 
 * @author samirromdhani
 *
 */
public class Test {

	public static void main(String[] args) {
		int x = 1;
		assert (x == 1) : aReturn();
		System.out.println("Hello ");
	}

	static int aReturn() {
		System.out.println("Hello Assert");
		return 1;
	}

}
