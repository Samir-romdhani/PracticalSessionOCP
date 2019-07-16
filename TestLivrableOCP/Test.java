import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
/**
 * @author samirromdhani
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("############  Binary Versions of Functional Interfaces ################");
		BiFunction<String, String, String> concatStr = (x, y) -> x + y;
		System.out.println(concatStr.apply("hello ", "world"));
		
		BiFunction<Double, Double, Integer> compareDoubles = Double::compare;
		System.out.println(compareDoubles.apply(10.0, 10.0));
		
		BiPredicate<List<Integer>, Integer> listContains = List::contains;
		List aList = Arrays.asList(10, 20, 30);
		System.out.println(listContains.test(aList, 20));
		
		BiConsumer<List<Integer>, Integer> listAddElement = List::add;
		List aList2 = new ArrayList();
		listAddElement.accept(aList2, 10);
		System.out.println(aList2);
		
		System.out.println("############  The UnaryOperator Interface ################");
		List<Integer> ell = Arrays.asList(-11, 22, 33, -44, 55);
		System.out.println("Before: " + ell);
		ell.replaceAll(Math::abs);
		System.out.println("After: " + ell);
	}
}
