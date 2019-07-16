import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author samirromdhani
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("############  The Predicate Interface  ################");
		Stream.of("hello", "world")
		.filter(/* Predicate go here */str -> str.startsWith("h"))
		.forEach(System.out::println);
		
		System.out.println("############   Demo  ################");
		Predicate<String> nullCheck = arg -> arg != null;
		System.out.println("test nullCheck : "+nullCheck.test(null));
		Predicate<String> emptyCheck = arg -> arg.length() > 0;
		System.out.println("test emptyCheck : "+emptyCheck.test(""));
		
		Predicate<String> hCheck = arg -> arg.startsWith("h");
		Predicate<String> nullAndEmptyCheck = nullCheck.and(emptyCheck).and(hCheck);
		String helloStr = "hello";
		System.out.println(nullAndEmptyCheck.test(helloStr));
		String nullStr = null;
		System.out.println(nullAndEmptyCheck.test(nullStr));
		
		System.out.println("############  The Predicate Interface  ################");
		Stream.of("hello", "world")
		.filter(/* Predicate go here */str -> nullAndEmptyCheck.test(str))
		.forEach(System.out::println);
	}
}
