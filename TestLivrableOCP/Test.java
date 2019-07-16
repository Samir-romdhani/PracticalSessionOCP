import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;
/**
 * @author samirromdhani
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("############  The Supplier Interfacee ################");
		//Use Case : use a method that does not take any input but returns some output
		Random random = new Random();
		Stream.generate(random::nextBoolean)  //static <T> Stream<T> generate(Supplier<T> s)
		.limit(2)
		.forEach(System.out::println);
		
		System.out.println("############   Demo  ################");
		Supplier<String> currentDateTime = () -> LocalDateTime.now().toString();
		System.out.println(currentDateTime.get());
	}
}
