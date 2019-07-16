import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
/**
 * @author samirromdhani
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("############  Primitive Versions of Predicate Interface ################");
		IntPredicate evenNums = i -> (i % 2) == 0;
		IntStream.range(1, 10).filter(evenNums).forEach(System.out::println);
		System.out.println("############  Primitive Versions of Function Interface ################");
		AtomicInteger ints = new AtomicInteger(0);
		/* Or IntStream */Stream.generate(ints::incrementAndGet).limit(10).forEach(System.out::println);
		System.out.println("############  Primitive Versions of Consumer Interface ################");
		// IntConsumer -> void accept(int value)
		// ObjIntConsumer<T> -> void accept(T t, int value)
		System.out.println("############  Primitive Versions of Supplier Interface ################");
		// IntSupplier -> boolean getAsInt()
	}
}
