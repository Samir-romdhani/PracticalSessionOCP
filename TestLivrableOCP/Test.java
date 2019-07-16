import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @author samirromdhani
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("############  The Consumer Interface ################");
		Stream.of("hello", "world")
		.forEach(/* Consumer go here */System.out::println); // void forEach(Consumer<? super T> action);
		
		System.out.println("############   Demo  ################");
		Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
		printUpperCase.accept("hello");
		
		System.out.println("############  The Consumer Interface ################");
		Stream.of("hello", "world")
		.forEach(str -> printUpperCase.accept(str));
	}
}
