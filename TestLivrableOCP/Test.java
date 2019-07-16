import java.util.function.Predicate;

/**
 * @author samirromdhani
 */
public class Test {

	public static void main(String[] args) {
		Predicate<String> nullCheck = arg -> arg != null;
		System.out.println("test : "+nullCheck);
		Predicate<String> emptyCheck = arg -> arg.length() > 0;
		Predicate<String> nullAndEmptyCheck = nullCheck.and(emptyCheck);
		String helloStr = "hello";
		System.out.println(nullAndEmptyCheck.test(helloStr));
		String nullStr = null;
		System.out.println(nullAndEmptyCheck.test(nullStr));
	}
}
